// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class RefreshDistrictMetaResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public RefreshDistrictMetaResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static RefreshDistrictMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDistrictMetaResponseBody self = new RefreshDistrictMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDistrictMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshDistrictMetaResponseBody setData(RefreshDistrictMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshDistrictMetaResponseBodyData getData() {
        return this.data;
    }

    public RefreshDistrictMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshDistrictMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshDistrictMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefreshDistrictMetaResponseBodyDataProjectQuotaLimit extends TeaModel {
        // key - districtId
        @NameInMap("DistrictLimitMap")
        public java.util.Map<String, DataProjectQuotaLimitDistrictLimitMapValue> districtLimitMap;

        // 限制类型 ：目前默认 - ReserveContainer
        @NameInMap("LimitType")
        public String limitType;

        public static RefreshDistrictMetaResponseBodyDataProjectQuotaLimit build(java.util.Map<String, ?> map) throws Exception {
            RefreshDistrictMetaResponseBodyDataProjectQuotaLimit self = new RefreshDistrictMetaResponseBodyDataProjectQuotaLimit();
            return TeaModel.build(map, self);
        }

        public RefreshDistrictMetaResponseBodyDataProjectQuotaLimit setDistrictLimitMap(java.util.Map<String, DataProjectQuotaLimitDistrictLimitMapValue> districtLimitMap) {
            this.districtLimitMap = districtLimitMap;
            return this;
        }
        public java.util.Map<String, DataProjectQuotaLimitDistrictLimitMapValue> getDistrictLimitMap() {
            return this.districtLimitMap;
        }

        public RefreshDistrictMetaResponseBodyDataProjectQuotaLimit setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class RefreshDistrictMetaResponseBodyData extends TeaModel {
        // 业务处理结果Code
        @NameInMap("Code")
        public String code;

        // 业务对象
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        // 业务处理消息摘要
        @NameInMap("Message")
        public String message;

        @NameInMap("ProjectQuotaLimit")
        public RefreshDistrictMetaResponseBodyDataProjectQuotaLimit projectQuotaLimit;

        // 操作请求ID
        @NameInMap("RequestId")
        public String requestId;

        // 业务处理是否成功
        @NameInMap("Success")
        public Boolean success;

        public static RefreshDistrictMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshDistrictMetaResponseBodyData self = new RefreshDistrictMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshDistrictMetaResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RefreshDistrictMetaResponseBodyData setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public RefreshDistrictMetaResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RefreshDistrictMetaResponseBodyData setProjectQuotaLimit(RefreshDistrictMetaResponseBodyDataProjectQuotaLimit projectQuotaLimit) {
            this.projectQuotaLimit = projectQuotaLimit;
            return this;
        }
        public RefreshDistrictMetaResponseBodyDataProjectQuotaLimit getProjectQuotaLimit() {
            return this.projectQuotaLimit;
        }

        public RefreshDistrictMetaResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RefreshDistrictMetaResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
