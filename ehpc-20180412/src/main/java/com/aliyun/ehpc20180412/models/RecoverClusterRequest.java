// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RecoverClusterRequest extends TeaModel {
    /**
     * <p>The service type of the domain account. Valid values:</p>
     * <ul>
     * <li>nis</li>
     * <li>ldap</li>
     * </ul>
     * <p>Default value: nis.</p>
     * 
     * <strong>example:</strong>
     * <p>nis</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The version of the E-HPC client. The default value is the latest version of the client.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> operation to query the latest version of the E-HPC client.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.76</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The cluster ID. The cluster must be in the Exception state.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the ID and status of a cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The image ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the images that are supported by E-HPC.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp18133n0335yq****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image. Valid values:</p>
     * <ul>
     * <li>system: public image</li>
     * <li>self: custom image</li>
     * <li>others: shared image</li>
     * </ul>
     * <p>Default value: system.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The tag of the system image.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the image tags supported by Elastic High Performance Computing (E-HPC).</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS_7.2_64</p>
     */
    @NameInMap("OsTag")
    public String osTag;

    /**
     * <p>The type of the scheduler. Valid values:</p>
     * <ul>
     * <li>pbs</li>
     * <li>slurm</li>
     * <li>opengridscheduler</li>
     * <li>deadline</li>
     * </ul>
     * <p>Default value: pbs.</p>
     * 
     * <strong>example:</strong>
     * <p>pbs</p>
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
