// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RecoverClusterRequest extends TeaModel {
    /**
     * <p>The service type of the domain account. Valid values:</p>
     * <br>
     * <p>*   nis</p>
     * <p>*   ldap</p>
     * <br>
     * <p>Default value: nis</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The version of the E-HPC client. The default value is the latest version of the client.</p>
     * <br>
     * <p>You can call the [ListCurrentClientVersion](~~87223~~) operation to query the current version of the E-HPC client.</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The ID of the cluster. The cluster must be in the Exception state.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID and status.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the image.</p>
     * <br>
     * <p>You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the images that are supported by E-HPC.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   system: public image</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <br>
     * <p>Default value: system</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The image tag of the operating system.</p>
     * <br>
     * <p>You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image tags supported by Elastic High Performance Computing (E-HPC).</p>
     */
    @NameInMap("OsTag")
    public String osTag;

    /**
     * <p>The type of the scheduler. Valid values:</p>
     * <br>
     * <p>*   pbs</p>
     * <p>*   slurm</p>
     * <p>*   opengridscheduler</p>
     * <p>*   deadline</p>
     * <br>
     * <p>Default value: pbs</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    public static RecoverClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverClusterRequest self = new RecoverClusterRequest();
        return TeaModel.build(map, self);
    }

    public RecoverClusterRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public RecoverClusterRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public RecoverClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RecoverClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RecoverClusterRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public RecoverClusterRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

    public RecoverClusterRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

}
