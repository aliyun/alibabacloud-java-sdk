// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityAlertOfAllRuleScopeByWatchIdResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The alert settings details.</p>
     */
    @NameInMap("QualityAlertInfo")
    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo qualityAlertInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityAlertOfAllRuleScopeByWatchIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityAlertOfAllRuleScopeByWatchIdResponseBody self = new GetQualityAlertOfAllRuleScopeByWatchIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody setQualityAlertInfo(GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo qualityAlertInfo) {
        this.qualityAlertInfo = qualityAlertInfo;
        return this;
    }
    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo getQualityAlertInfo() {
        return this.qualityAlertInfo;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList extends TeaModel {
        /**
         * <p>The alert duty roster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The alert duty roster name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList self = new GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList();
            return TeaModel.build(map, self);
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList self = new GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList();
            return TeaModel.build(map, self);
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo extends TeaModel {
        /**
         * <p>The duty roster alert channels.</p>
         */
        @NameInMap("AlertDutyChannelList")
        public java.util.List<String> alertDutyChannelList;

        /**
         * <p>The duty roster alert list.</p>
         */
        @NameInMap("AlertDutyList")
        public java.util.List<GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList> alertDutyList;

        /**
         * <p>The quality owner alert channels.</p>
         */
        @NameInMap("AlertQualityOwnerChannelList")
        public java.util.List<String> alertQualityOwnerChannelList;

        /**
         * <p>The user alert channels.</p>
         */
        @NameInMap("AlertUserChannelList")
        public java.util.List<String> alertUserChannelList;

        /**
         * <p>The user alert list.</p>
         */
        @NameInMap("AlertUserList")
        public java.util.List<GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList> alertUserList;

        /**
         * <p>Indicates whether alerting is enabled for the quality owner.</p>
         */
        @NameInMap("EnableAlertQualityOwner")
        public Boolean enableAlertQualityOwner;

        /**
         * <p>The monitored object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo self = new GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setAlertDutyChannelList(java.util.List<String> alertDutyChannelList) {
            this.alertDutyChannelList = alertDutyChannelList;
            return this;
        }
        public java.util.List<String> getAlertDutyChannelList() {
            return this.alertDutyChannelList;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setAlertDutyList(java.util.List<GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList> alertDutyList) {
            this.alertDutyList = alertDutyList;
            return this;
        }
        public java.util.List<GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertDutyList> getAlertDutyList() {
            return this.alertDutyList;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setAlertQualityOwnerChannelList(java.util.List<String> alertQualityOwnerChannelList) {
            this.alertQualityOwnerChannelList = alertQualityOwnerChannelList;
            return this;
        }
        public java.util.List<String> getAlertQualityOwnerChannelList() {
            return this.alertQualityOwnerChannelList;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setAlertUserChannelList(java.util.List<String> alertUserChannelList) {
            this.alertUserChannelList = alertUserChannelList;
            return this;
        }
        public java.util.List<String> getAlertUserChannelList() {
            return this.alertUserChannelList;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setAlertUserList(java.util.List<GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList> alertUserList) {
            this.alertUserList = alertUserList;
            return this;
        }
        public java.util.List<GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfoAlertUserList> getAlertUserList() {
            return this.alertUserList;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setEnableAlertQualityOwner(Boolean enableAlertQualityOwner) {
            this.enableAlertQualityOwner = enableAlertQualityOwner;
            return this;
        }
        public Boolean getEnableAlertQualityOwner() {
            return this.enableAlertQualityOwner;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBodyQualityAlertInfo setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
