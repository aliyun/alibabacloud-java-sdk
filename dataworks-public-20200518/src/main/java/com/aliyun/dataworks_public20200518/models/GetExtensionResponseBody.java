// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetExtensionResponseBody extends TeaModel {
    /**
     * <p>The details of the extension.</p>
     */
    @NameInMap("Extension")
    public GetExtensionResponseBodyExtension extension;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
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
        /**
         * <p>The code of the extension point event.</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The name of the extension point event.</p>
         */
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
        /**
         * <p>The code of the event type.</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <p>The name of the event type.</p>
         */
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
        /**
         * <p>The extension point events.</p>
         */
        @NameInMap("BindEventList")
        public java.util.List<GetExtensionResponseBodyExtensionBindEventList> bindEventList;

        /**
         * <p>The URL of the help document about the extension. You can visit the URL for the details of the extension.</p>
         */
        @NameInMap("DetailUrl")
        public String detailUrl;

        /**
         * <p>The types of the events.</p>
         */
        @NameInMap("EventCategoryList")
        public java.util.List<GetExtensionResponseBodyExtensionEventCategoryList> eventCategoryList;

        /**
         * <p>The unique code of the extension.</p>
         */
        @NameInMap("ExtensionCode")
        public String extensionCode;

        /**
         * <p>The description of the extension.</p>
         */
        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        /**
         * <p>The name of the extension.</p>
         */
        @NameInMap("ExtensionName")
        public String extensionName;

        /**
         * <p>The URL of the help document about the extension.</p>
         */
        @NameInMap("HelpDocUrl")
        public String helpDocUrl;

        /**
         * <p>The option settings of the extension.</p>
         */
        @NameInMap("OptionSetting")
        public String optionSetting;

        /**
         * <p>The parameter settings of the extension. For more information, visit https://www.alibabacloud.com/help/en/dataworks/latest/set-extension-parameters.</p>
         */
        @NameInMap("ParameterSetting")
        public String parameterSetting;

        /**
         * <p>The workspace for testing. If the extension is in the testing state, the extension can be used only in the workspace for testing.</p>
         */
        @NameInMap("ProjectTesting")
        public Long projectTesting;

        /**
         * <p>The state of the extension. 0: testing. 1: publishing. 3: disabled. 4: approving. 5: approved. 6: approval failed.</p>
         */
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
