// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePhoneNoAReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>请求状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A号码报备结果结构体</p>
     */
    @NameInMap("Data")
    public CreatePhoneNoAReportResponseBodyData data;

    /**
     * <p>失败错误提示</p>
     * 
     * <strong>example:</strong>
     * <p>手机号码***已存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回id</p>
     * 
     * <strong>example:</strong>
     * <p>1D73E648-0978-18A5-B089-3BB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreatePhoneNoAReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneNoAReportResponseBody self = new CreatePhoneNoAReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhoneNoAReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreatePhoneNoAReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePhoneNoAReportResponseBody setData(CreatePhoneNoAReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePhoneNoAReportResponseBodyData getData() {
        return this.data;
    }

    public CreatePhoneNoAReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePhoneNoAReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePhoneNoAReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePhoneNoAReportResponseBodyData extends TeaModel {
        /**
         * <p>创建结果</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CreateResult")
        public Boolean createResult;

        /**
         * <p>创建类型枚举，1为成功，负数为创建失败</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailType")
        public Long failType;

        public static CreatePhoneNoAReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePhoneNoAReportResponseBodyData self = new CreatePhoneNoAReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePhoneNoAReportResponseBodyData setCreateResult(Boolean createResult) {
            this.createResult = createResult;
            return this;
        }
        public Boolean getCreateResult() {
            return this.createResult;
        }

        public CreatePhoneNoAReportResponseBodyData setFailType(Long failType) {
            this.failType = failType;
            return this;
        }
        public Long getFailType() {
            return this.failType;
        }

    }

}
