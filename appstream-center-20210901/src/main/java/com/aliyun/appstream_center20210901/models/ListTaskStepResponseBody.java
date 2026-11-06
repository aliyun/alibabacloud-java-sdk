// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTaskStepResponseBody extends TeaModel {
    /**
     * <p>The total number of records returned in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of step definitions for the specified task type.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTaskStepResponseBodyData> data;

    /**
     * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskStepResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskStepResponseBody self = new ListTaskStepResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskStepResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListTaskStepResponseBody setData(java.util.List<ListTaskStepResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTaskStepResponseBodyData> getData() {
        return this.data;
    }

    public ListTaskStepResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskStepResponseBodyData extends TeaModel {
        /**
         * <p>The interaction method of the step. Valid values:</p>
         * <ul>
         * <li><strong>prompt</strong>: Displays step prompts.</li>
         * <li><strong>connection</strong>: Provides connection operations to enter the builder or validation environment.</li>
         * <li><strong>prompt_connection</strong>: Provides both prompts and connection operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connection</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The Chinese name of the phase to which the step belongs, such as builder environment preparation or test validation.</p>
         * 
         * <strong>example:</strong>
         * <p>制作环境准备</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The English name of the phase to which the step belongs. This field is returned for image creation steps, but may not be returned for application adaptation steps.</p>
         * 
         * <strong>example:</strong>
         * <p>Builder Environment Preparation</p>
         */
        @NameInMap("CategoryEn")
        public String categoryEn;

        /**
         * <p>The numeric index of the step definition, which is used to identify the step and its sequence. Do not use this value as the completion percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The name identifier of the step, which is used to match the step records returned by GetTask.</p>
         * <p>Steps when Type is set to IMAGE:</p>
         * <ul>
         * <li><strong>INIT</strong>: Initialize the task.</li>
         * <li><strong>CREATE_BUILDER_ENV</strong>: Create the builder environment.</li>
         * <li><strong>DEPLOY_BUILDER_ENV</strong>: Deploy the builder environment.</li>
         * <li><strong>INIT_BUILDER</strong>: Initialize the builder tool.</li>
         * <li><strong>DOWNLOAD_APP</strong>: Download application resources.</li>
         * <li><strong>START_BUILD</strong>: Start image creation.</li>
         * <li><strong>COMPLETE_INSTALL</strong>: Complete application installation and configuration.</li>
         * <li><strong>CREATE_VALIDATE_ENV</strong>: Create the validation environment.</li>
         * <li><strong>DEPLOY_VALIDATE_ENV</strong>: Deploy the validation environment.</li>
         * <li><strong>COMPLETE_VALIDATE</strong>: Complete image validation.</li>
         * <li><strong>ARCHIVE_DATA</strong>: Archive image data.</li>
         * <li><strong>CREATE_IMAGE</strong>: Generate the image.</li>
         * <li><strong>FINISH_ADAPT</strong>: End the creation process.</li>
         * </ul>
         * <p>Steps when Type is set to ADAPTOR:</p>
         * <ul>
         * <li><strong>INIT</strong>: Initialize the task.</li>
         * <li><strong>CREATE_BUILDER_ENV</strong>: Create the builder environment.</li>
         * <li><strong>DEPLOY_BUILDER_ENV</strong>: Deploy the builder environment.</li>
         * <li><strong>INIT_BUILDER</strong>: Initialize the builder tool.</li>
         * <li><strong>DOWNLOAD_APP</strong>: Download application resources.</li>
         * <li><strong>START_VHD</strong>: Start application recording.</li>
         * <li><strong>BUILD_VHD</strong>: Generate the application VHD.</li>
         * <li><strong>UPLOAD_VHD</strong>: Upload the application VHD.</li>
         * <li><strong>COMPLETE_BUILDER</strong>: Complete application creation.</li>
         * <li><strong>CREATE_VALIDATE_ENV</strong>: Create the validation environment.</li>
         * <li><strong>DEPLOY_VALIDATE_ENV</strong>: Deploy the validation environment.</li>
         * <li><strong>COMPLETE_VALIDATE</strong>: Complete application validation.</li>
         * <li><strong>CREATE_IMAGE</strong>: Generate the application image.</li>
         * <li><strong>FINISH_ADAPT</strong>: End the application adaptation process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE_BUILDER_ENV</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListTaskStepResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskStepResponseBodyData self = new ListTaskStepResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskStepResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListTaskStepResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTaskStepResponseBodyData setCategoryEn(String categoryEn) {
            this.categoryEn = categoryEn;
            return this;
        }
        public String getCategoryEn() {
            return this.categoryEn;
        }

        public ListTaskStepResponseBodyData setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListTaskStepResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
