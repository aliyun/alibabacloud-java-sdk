// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateKyuubiServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2c8g</p>
     */
    @NameInMap("computeInstance")
    public String computeInstance;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;key\&quot;:\&quot;kyuubi.engine.share.level\&quot;,\&quot;value\&quot;:\&quot;USER\&quot;}]</p>
     */
    @NameInMap("kyuubiConfigs")
    public String kyuubiConfigs;

    /**
     * <strong>example:</strong>
     * <p>1.9.2-0.0.2</p>
     */
    @NameInMap("kyuubiReleaseVersion")
    public String kyuubiReleaseVersion;

    /**
     * <strong>example:</strong>
     * <p>dev_serverless_spark</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("publicEndpointEnabled")
    public Boolean publicEndpointEnabled;

    /**
     * <strong>example:</strong>
     * <p>dev_queue</p>
     */
    @NameInMap("queue")
    public String queue;

    /**
     * <strong>example:</strong>
     * <p>esr-4.6.0 (Spark 3.5.2, Scala 2.12)</p>
     */
    @NameInMap("releaseVersion")
    public String releaseVersion;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("replica")
    public Integer replica;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;key\&quot;:\&quot;spark.app.name\&quot;,\&quot;value\&quot;:\&quot;test\&quot;}]</p>
     */
    @NameInMap("sparkConfigs")
    public String sparkConfigs;

    public static CreateKyuubiServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKyuubiServiceRequest self = new CreateKyuubiServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateKyuubiServiceRequest setComputeInstance(String computeInstance) {
        this.computeInstance = computeInstance;
        return this;
    }
    public String getComputeInstance() {
        return this.computeInstance;
    }

    public CreateKyuubiServiceRequest setKyuubiConfigs(String kyuubiConfigs) {
        this.kyuubiConfigs = kyuubiConfigs;
        return this;
    }
    public String getKyuubiConfigs() {
        return this.kyuubiConfigs;
    }

    public CreateKyuubiServiceRequest setKyuubiReleaseVersion(String kyuubiReleaseVersion) {
        this.kyuubiReleaseVersion = kyuubiReleaseVersion;
        return this;
    }
    public String getKyuubiReleaseVersion() {
        return this.kyuubiReleaseVersion;
    }

    public CreateKyuubiServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKyuubiServiceRequest setPublicEndpointEnabled(Boolean publicEndpointEnabled) {
        this.publicEndpointEnabled = publicEndpointEnabled;
        return this;
    }
    public Boolean getPublicEndpointEnabled() {
        return this.publicEndpointEnabled;
    }

    public CreateKyuubiServiceRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public CreateKyuubiServiceRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public CreateKyuubiServiceRequest setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

    public CreateKyuubiServiceRequest setSparkConfigs(String sparkConfigs) {
        this.sparkConfigs = sparkConfigs;
        return this;
    }
    public String getSparkConfigs() {
        return this.sparkConfigs;
    }

}
