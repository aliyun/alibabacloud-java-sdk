// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class ListOutlierPolicyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListOutlierPolicyResponseData data;

    public static ListOutlierPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutlierPolicyResponse self = new ListOutlierPolicyResponse();
        return TeaModel.build(map, self);
    }

    public static class ListOutlierPolicyResponseDataResultAppList extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Dockerize")
        @Validation(required = true)
        public Boolean dockerize;

        public static ListOutlierPolicyResponseDataResultAppList build(java.util.Map<String, ?> map) throws Exception {
            ListOutlierPolicyResponseDataResultAppList self = new ListOutlierPolicyResponseDataResultAppList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListOutlierPolicyResponseDataResult extends TeaModel {
        @NameInMap("ErrorRateThreshold")
        @Validation(required = true)
        public Double errorRateThreshold;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("IsOutlierEnabled")
        @Validation(required = true)
        public Boolean isOutlierEnabled;

        @NameInMap("IsolationTime")
        @Validation(required = true)
        public Integer isolationTime;

        @NameInMap("MaxIsolationRate")
        @Validation(required = true)
        public Double maxIsolationRate;

        @NameInMap("MaxIsolationTimeMultiple")
        @Validation(required = true)
        public Integer maxIsolationTimeMultiple;

        @NameInMap("NamespaceId")
        @Validation(required = true)
        public String namespaceId;

        @NameInMap("PolicyId")
        @Validation(required = true)
        public Integer policyId;

        @NameInMap("PolicyName")
        @Validation(required = true)
        public String policyName;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("RequestThreshold")
        @Validation(required = true)
        public Integer requestThreshold;

        @NameInMap("RpcType")
        @Validation(required = true)
        public Integer rpcType;

        @NameInMap("ShouldCountBizError")
        @Validation(required = true)
        public Boolean shouldCountBizError;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("AppList")
        @Validation(required = true)
        public java.util.List<ListOutlierPolicyResponseDataResultAppList> appList;

        public static ListOutlierPolicyResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListOutlierPolicyResponseDataResult self = new ListOutlierPolicyResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class ListOutlierPolicyResponseData extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<ListOutlierPolicyResponseDataResult> result;

        public static ListOutlierPolicyResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOutlierPolicyResponseData self = new ListOutlierPolicyResponseData();
            return TeaModel.build(map, self);
        }

    }

}
