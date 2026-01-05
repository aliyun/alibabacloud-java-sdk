// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAppIcpRecordResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QuerySmsAppIcpRecordResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C9955E63-8BFF-101D-80A1-E6998DFEFF1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySmsAppIcpRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAppIcpRecordResponseBody self = new QuerySmsAppIcpRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsAppIcpRecordResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySmsAppIcpRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsAppIcpRecordResponseBody setData(java.util.List<QuerySmsAppIcpRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySmsAppIcpRecordResponseBodyData> getData() {
        return this.data;
    }

    public QuerySmsAppIcpRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySmsAppIcpRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsAppIcpRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySmsAppIcpRecordResponseBodyData extends TeaModel {
        /**
         * <p>审核通过日期，示例2025-09-01</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("AppApprovalDate")
        public String appApprovalDate;

        /**
         * <p>ICP备案/许可证号</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AppIcpLicenseNumber")
        public String appIcpLicenseNumber;

        /**
         * <p>app-icp备案材料id</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("AppIcpRecordId")
        public Long appIcpRecordId;

        /**
         * <p>app-icp备案截图图片Osskey（给签名传工单用）</p>
         * 
         * <strong>example:</strong>
         * <p>10000025<em><strong><strong>02/ac181696-</strong></strong>-49c6-90dc-50689267aa00_mhsjd8b8_17****</em>662348.jpeg</p>
         */
        @NameInMap("AppIcpRecordPic")
        public String appIcpRecordPic;

        /**
         * <p>app-icp备案截图url地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&OSSAccessKeyId=bypFN****73PsLI&Signature=BygI9X****h7%2FXmFIo****FB2c%3D">https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&amp;OSSAccessKeyId=bypFN****73PsLI&amp;Signature=BygI9X****h7%2FXmFIo****FB2c%3D</a></p>
         */
        @NameInMap("AppIcpRecordPicUrl")
        public String appIcpRecordPicUrl;

        /**
         * <p>主办单位名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AppPrincipalUnitName")
        public String appPrincipalUnitName;

        /**
         * <p>app服务名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AppServiceName")
        public String appServiceName;

        /**
         * <p>APP应用商店链接</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test">https://test</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        public static QuerySmsAppIcpRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsAppIcpRecordResponseBodyData self = new QuerySmsAppIcpRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppApprovalDate(String appApprovalDate) {
            this.appApprovalDate = appApprovalDate;
            return this;
        }
        public String getAppApprovalDate() {
            return this.appApprovalDate;
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppIcpLicenseNumber(String appIcpLicenseNumber) {
            this.appIcpLicenseNumber = appIcpLicenseNumber;
            return this;
        }
        public String getAppIcpLicenseNumber() {
            return this.appIcpLicenseNumber;
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppIcpRecordId(Long appIcpRecordId) {
            this.appIcpRecordId = appIcpRecordId;
            return this;
        }
        public Long getAppIcpRecordId() {
            return this.appIcpRecordId;
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppIcpRecordPic(String appIcpRecordPic) {
            this.appIcpRecordPic = appIcpRecordPic;
            return this;
        }
        public String getAppIcpRecordPic() {
            return this.appIcpRecordPic;
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppIcpRecordPicUrl(String appIcpRecordPicUrl) {
            this.appIcpRecordPicUrl = appIcpRecordPicUrl;
            return this;
        }
        public String getAppIcpRecordPicUrl() {
            return this.appIcpRecordPicUrl;
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppPrincipalUnitName(String appPrincipalUnitName) {
            this.appPrincipalUnitName = appPrincipalUnitName;
            return this;
        }
        public String getAppPrincipalUnitName() {
            return this.appPrincipalUnitName;
        }

        public QuerySmsAppIcpRecordResponseBodyData setAppServiceName(String appServiceName) {
            this.appServiceName = appServiceName;
            return this;
        }
        public String getAppServiceName() {
            return this.appServiceName;
        }

        public QuerySmsAppIcpRecordResponseBodyData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
