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
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG</p>
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
         * 
         * <strong>example:</strong>
         * <p>commit-file</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The name of the extension point event.</p>
         * 
         * <strong>example:</strong>
         * <p>File submission pre-event</p>
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
         * 
         * <strong>example:</strong>
         * <p>file-change</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <p>The name of the event type.</p>
         * 
         * <strong>example:</strong>
         * <p>File change event</p>
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
         * <p>The list of extension points.</p>
         */
        @NameInMap("BindEventList")
        public java.util.List<GetExtensionResponseBodyExtensionBindEventList> bindEventList;

        /**
         * <p>The URL of the extension details page, on which users can view the details of the process blocked by the extension.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/">https://www.aliyun.com/</a></p>
         */
        @NameInMap("DetailUrl")
        public String detailUrl;

        /**
         * <p>The list of event types.</p>
         */
        @NameInMap("EventCategoryList")
        public java.util.List<GetExtensionResponseBodyExtensionEventCategoryList> eventCategoryList;

        /**
         * <p>The unique code of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>ce4*********086da5</p>
         */
        @NameInMap("ExtensionCode")
        public String extensionCode;

        /**
         * <p>The description of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description</p>
         */
        @NameInMap("ExtensionDesc")
        public String extensionDesc;

        /**
         * <p>The name of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>Extension name</p>
         */
        @NameInMap("ExtensionName")
        public String extensionName;

        /**
         * <p>The URL of the help documentation of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com/">https://www.aliyun.com/</a></p>
         */
        @NameInMap("HelpDocUrl")
        public String helpDocUrl;

        /**
         * <p>The options defined for the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>Option configuration</p>
         */
        @NameInMap("OptionSetting")
        public String optionSetting;

        /**
         * <p>The parameter settings of the extension. For more information, see <a href="https://help.aliyun.com/document_detail/405354.html">Configure extension parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>extension.project.disabled=projectId1,projectId2,projectId3</p>
         */
        @NameInMap("ParameterSetting")
        public String parameterSetting;

        /**
         * <p>The workspace for testing. If the extension is being tested, the extension can be used only in the workspace for testing.</p>
         * 
         * <strong>example:</strong>
         * <p>13552</p>
         */
        @NameInMap("ProjectTesting")
        public Long projectTesting;

        /**
         * <p>The state of the extension. 0: Testing, 1: Publishing, 3: Disabled, 4: Processing, 5: Approved, 6: Approve Failed</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
