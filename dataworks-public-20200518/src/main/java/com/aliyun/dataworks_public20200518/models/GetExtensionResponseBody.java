// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetExtensionResponseBody extends TeaModel {
    @NameInMap("Extension")
    public GetExtensionResponseBodyExtension extension;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExtensionResponseBody self = new GetExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExtensionResponseBody setExtension(GetExtensionResponseBodyExtension extension) {
        this.extension = extension;
        return this;
    }
    public GetExtensionResponseBodyExtension getExtension() {
        return this.extension;
    }

    public GetExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExtensionResponseBodyExtensionBindEventList extends TeaModel {
        @NameInMap("EventCode")
        public String eventCode;

        @NameInMap("EventName")
        public String eventName;

        public static GetExtensionResponseBodyExtensionBindEventList build(java.util.Map<String, ?> map) throws Exception {
            GetExtensionResponseBodyExtensionBindEventList self = new GetExtensionResponseBodyExtensionBindEventList();
            return TeaModel.build(map, self);
        }

        public GetExtensionResponseBodyExtensionBindEventList setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public GetExtensionResponseBodyExtensionBindEventList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

    }

    public static class GetExtensionResponseBodyExtensionEventCategoryList extends TeaModel {
        @NameInMap("CategoryCode")
        public String categoryCode;

        @NameInMap("CategoryName")
        public String categoryName;

        public static GetExtensionResponseBodyExtensionEventCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetExtensionResponseBodyExtensionEventCategoryList self = new GetExtensionResponseBodyExtensionEventCategoryList();
            return TeaModel.build(map, self);
        }

        public GetExtensionResponseBodyExtensionEventCategoryList setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public GetExtensionResponseBodyExtensionEventCategoryList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

    public static class GetExtensionResponseBodyExtension extends TeaModel {
        @NameInMap("BindEventList")
        public java.util.List<GetExtensionResponseBodyExtensionBindEventList> bindEventList;

        @NameInMap("DetailUrl")
        public String detailUrl;

        @NameInMap("EventCategoryList")
        public java.util.List<GetExtensionResponseBodyExtensionEventCategoryList> eventCategoryList;

        @NameInMap("ExtensionCode")
        public String extensionCode;

        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        @NameInMap("ExtensionName")
        public String extensionName;

        @NameInMap("HelpDocUrl")
        public String helpDocUrl;

        @NameInMap("OptionSetting")
        public String optionSetting;

        @NameInMap("ParameterSetting")
        public String parameterSetting;

        @NameInMap("ProjectTesting")
        public Long projectTesting;

        @NameInMap("Status")
        public Integer status;

        public static GetExtensionResponseBodyExtension build(java.util.Map<String, ?> map) throws Exception {
            GetExtensionResponseBodyExtension self = new GetExtensionResponseBodyExtension();
            return TeaModel.build(map, self);
        }

        public GetExtensionResponseBodyExtension setBindEventList(java.util.List<GetExtensionResponseBodyExtensionBindEventList> bindEventList) {
            this.bindEventList = bindEventList;
            return this;
        }
        public java.util.List<GetExtensionResponseBodyExtensionBindEventList> getBindEventList() {
            return this.bindEventList;
        }

        public GetExtensionResponseBodyExtension setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }
        public String getDetailUrl() {
            return this.detailUrl;
        }

        public GetExtensionResponseBodyExtension setEventCategoryList(java.util.List<GetExtensionResponseBodyExtensionEventCategoryList> eventCategoryList) {
            this.eventCategoryList = eventCategoryList;
            return this;
        }
        public java.util.List<GetExtensionResponseBodyExtensionEventCategoryList> getEventCategoryList() {
            return this.eventCategoryList;
        }

        public GetExtensionResponseBodyExtension setExtensionCode(String extensionCode) {
            this.extensionCode = extensionCode;
            return this;
        }
        public String getExtensionCode() {
            return this.extensionCode;
        }

        public GetExtensionResponseBodyExtension setExtensionDesc(String extensionDesc) {
            this.extensionDesc = extensionDesc;
            return this;
        }
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        public GetExtensionResponseBodyExtension setExtensionName(String extensionName) {
            this.extensionName = extensionName;
            return this;
        }
        public String getExtensionName() {
            return this.extensionName;
        }

        public GetExtensionResponseBodyExtension setHelpDocUrl(String helpDocUrl) {
            this.helpDocUrl = helpDocUrl;
            return this;
        }
        public String getHelpDocUrl() {
            return this.helpDocUrl;
        }

        public GetExtensionResponseBodyExtension setOptionSetting(String optionSetting) {
            this.optionSetting = optionSetting;
            return this;
        }
        public String getOptionSetting() {
            return this.optionSetting;
        }

        public GetExtensionResponseBodyExtension setParameterSetting(String parameterSetting) {
            this.parameterSetting = parameterSetting;
            return this;
        }
        public String getParameterSetting() {
            return this.parameterSetting;
        }

        public GetExtensionResponseBodyExtension setProjectTesting(Long projectTesting) {
            this.projectTesting = projectTesting;
            return this;
        }
        public Long getProjectTesting() {
            return this.projectTesting;
        }

        public GetExtensionResponseBodyExtension setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
