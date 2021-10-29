// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateAdamBenchTaskRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DstInstanceId")
    public String dstInstanceId;

    @NameInMap("DstSuperAccount")
    public String dstSuperAccount;

    @NameInMap("DstSuperPassword")
    public String dstSuperPassword;

    @NameInMap("Rate")
    public Integer rate;

    @NameInMap("RequestDuration")
    public Long requestDuration;

    @NameInMap("RequestStartTime")
    public Long requestStartTime;

    @NameInMap("SrcEngine")
    public String srcEngine;

    @NameInMap("SrcEngineVersion")
    public String srcEngineVersion;

    @NameInMap("SrcMaxQps")
    public Double srcMaxQps;

    @NameInMap("SrcMeanQps")
    public Double srcMeanQps;

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
