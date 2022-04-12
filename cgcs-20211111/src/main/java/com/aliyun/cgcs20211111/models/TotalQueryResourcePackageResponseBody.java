// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalQueryResourcePackageResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public TotalQueryResourcePackageResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static TotalQueryResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TotalQueryResourcePackageResponseBody self = new TotalQueryResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public TotalQueryResourcePackageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TotalQueryResourcePackageResponseBody setData(TotalQueryResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TotalQueryResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public TotalQueryResourcePackageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TotalQueryResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TotalQueryResourcePackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TotalQueryResourcePackageResponseBodyData extends TeaModel {
        // 租户UserId
        @NameInMap("TenantUid")
        public String tenantUid;

        // 当前所有有效资源包总量
        @NameInMap("TotalAmount")
        public Long totalAmount;

        // 计算时间
        @NameInMap("TotalDate")
        public String totalDate;

        public static TotalQueryResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TotalQueryResourcePackageResponseBodyData self = new TotalQueryResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TotalQueryResourcePackageResponseBodyData setTenantUid(String tenantUid) {
            this.tenantUid = tenantUid;
            return this;
        }
        public String getTenantUid() {
            return this.tenantUid;
        }

        public TotalQueryResourcePackageResponseBodyData setTotalAmount(Long totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Long getTotalAmount() {
            return this.totalAmount;
        }

        public TotalQueryResourcePackageResponseBodyData setTotalDate(String totalDate) {
            this.totalDate = totalDate;
            return this;
        }
        public String getTotalDate() {
            return this.totalDate;
        }

    }

}
