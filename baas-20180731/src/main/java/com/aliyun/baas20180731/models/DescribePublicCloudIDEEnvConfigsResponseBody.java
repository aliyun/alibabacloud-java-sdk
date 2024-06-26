// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicCloudIDEEnvConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribePublicCloudIDEEnvConfigsResponseBodyResult> result;

    public static DescribePublicCloudIDEEnvConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicCloudIDEEnvConfigsResponseBody self = new DescribePublicCloudIDEEnvConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePublicCloudIDEEnvConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublicCloudIDEEnvConfigsResponseBody setResult(java.util.List<DescribePublicCloudIDEEnvConfigsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribePublicCloudIDEEnvConfigsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribePublicCloudIDEEnvConfigsResponseBodyResult extends TeaModel {
        @NameInMap("Bizid")
        public String bizid;

        @NameInMap("Name")
        public String name;

        @NameInMap("TrialAccount")
        public String trialAccount;

        @NameInMap("TrialAccountPrivateKey")
        public String trialAccountPrivateKey;

        @NameInMap("Version")
        public String version;

        public static DescribePublicCloudIDEEnvConfigsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePublicCloudIDEEnvConfigsResponseBodyResult self = new DescribePublicCloudIDEEnvConfigsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePublicCloudIDEEnvConfigsResponseBodyResult setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribePublicCloudIDEEnvConfigsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePublicCloudIDEEnvConfigsResponseBodyResult setTrialAccount(String trialAccount) {
            this.trialAccount = trialAccount;
            return this;
        }
        public String getTrialAccount() {
            return this.trialAccount;
        }

        public DescribePublicCloudIDEEnvConfigsResponseBodyResult setTrialAccountPrivateKey(String trialAccountPrivateKey) {
            this.trialAccountPrivateKey = trialAccountPrivateKey;
            return this;
        }
        public String getTrialAccountPrivateKey() {
            return this.trialAccountPrivateKey;
        }

        public DescribePublicCloudIDEEnvConfigsResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
