// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateAdamBenchTaskRequest extends TeaModel {
    /**
     * <p>The description of the stress testing task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the destination instance. The instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance. You can call the [GetInstanceInspections](https://help.aliyun.com/document_detail/202857.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DstInstanceId")
    public String dstInstanceId;

    /**
     * <p>The name of the privileged account for the destination instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DstSuperAccount")
    public String dstSuperAccount;

    /**
     * <p>The password of the privileged account for the destination instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DstSuperPassword")
    public String dstSuperPassword;

    /**
     * <p>The rate at which the traffic captured from the source database instance is replayed on the destination database instance. Valid values: 1 to 30. Default value: 1.</p>
     */
    @NameInMap("Rate")
    public Integer rate;

    /**
     * <p>The duration of the stress testing task for which the traffic is captured from the source instance. Unit: milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestDuration")
    public Long requestDuration;

    /**
     * <p>The start time of the stress testing task. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestStartTime")
    public Long requestStartTime;

    /**
     * <p>The database engine that the source database instance runs.</p>
     */
    @NameInMap("SrcEngine")
    public String srcEngine;

    /**
     * <p>The version of the database engine that the source database instance runs.</p>
     */
    @NameInMap("SrcEngineVersion")
    public String srcEngineVersion;

    /**
     * <p>The maximum number of queries per second (QPS) within the time period during which traffic on the source database instance is captured. The value must be accurate to two decimal places.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SrcMaxQps")
    public Double srcMaxQps;

    /**
     * <p>The average QPS within the time period in which traffic on the source database instance is captured. The value must be accurate to two decimal places.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SrcMeanQps")
    public Double srcMeanQps;

    /**
     * <p>The URL of the Object Storage Service (OSS) folder in which the archived objects for SQL statements that run on the source database instance are stored. You can obtain the URL after you upload the archived files to OSS.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SrcSqlOssAddr")
    public String srcSqlOssAddr;

    public static CreateAdamBenchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdamBenchTaskRequest self = new CreateAdamBenchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdamBenchTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAdamBenchTaskRequest setDstInstanceId(String dstInstanceId) {
        this.dstInstanceId = dstInstanceId;
        return this;
    }
    public String getDstInstanceId() {
        return this.dstInstanceId;
    }

    public CreateAdamBenchTaskRequest setDstSuperAccount(String dstSuperAccount) {
        this.dstSuperAccount = dstSuperAccount;
        return this;
    }
    public String getDstSuperAccount() {
        return this.dstSuperAccount;
    }

    public CreateAdamBenchTaskRequest setDstSuperPassword(String dstSuperPassword) {
        this.dstSuperPassword = dstSuperPassword;
        return this;
    }
    public String getDstSuperPassword() {
        return this.dstSuperPassword;
    }

    public CreateAdamBenchTaskRequest setRate(Integer rate) {
        this.rate = rate;
        return this;
    }
    public Integer getRate() {
        return this.rate;
    }

    public CreateAdamBenchTaskRequest setRequestDuration(Long requestDuration) {
        this.requestDuration = requestDuration;
        return this;
    }
    public Long getRequestDuration() {
        return this.requestDuration;
    }

    public CreateAdamBenchTaskRequest setRequestStartTime(Long requestStartTime) {
        this.requestStartTime = requestStartTime;
        return this;
    }
    public Long getRequestStartTime() {
        return this.requestStartTime;
    }

    public CreateAdamBenchTaskRequest setSrcEngine(String srcEngine) {
        this.srcEngine = srcEngine;
        return this;
    }
    public String getSrcEngine() {
        return this.srcEngine;
    }

    public CreateAdamBenchTaskRequest setSrcEngineVersion(String srcEngineVersion) {
        this.srcEngineVersion = srcEngineVersion;
        return this;
    }
    public String getSrcEngineVersion() {
        return this.srcEngineVersion;
    }

    public CreateAdamBenchTaskRequest setSrcMaxQps(Double srcMaxQps) {
        this.srcMaxQps = srcMaxQps;
        return this;
    }
    public Double getSrcMaxQps() {
        return this.srcMaxQps;
    }

    public CreateAdamBenchTaskRequest setSrcMeanQps(Double srcMeanQps) {
        this.srcMeanQps = srcMeanQps;
        return this;
    }
    public Double getSrcMeanQps() {
        return this.srcMeanQps;
    }

    public CreateAdamBenchTaskRequest setSrcSqlOssAddr(String srcSqlOssAddr) {
        this.srcSqlOssAddr = srcSqlOssAddr;
        return this;
    }
    public String getSrcSqlOssAddr() {
        return this.srcSqlOssAddr;
    }

}
