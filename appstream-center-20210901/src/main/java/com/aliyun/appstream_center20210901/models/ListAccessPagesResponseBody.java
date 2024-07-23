// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAccessPagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Count")
    public String count;

    @NameInMap("Data")
    public java.util.List<ListAccessPagesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>AF8361BD-5ECB-139A-B019-2E0350CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListAccessPagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPagesResponseBody self = new ListAccessPagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessPagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAccessPagesResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public ListAccessPagesResponseBody setData(java.util.List<ListAccessPagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAccessPagesResponseBodyData> getData() {
        return this.data;
    }

    public ListAccessPagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAccessPagesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAccessPagesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAccessPagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessPagesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListAccessPagesResponseBodyData extends TeaModel {
        @NameInMap("AccessMode")
        public String accessMode;

        /**
         * <strong>example:</strong>
         * <p>a-062wec3cwmayw****</p>
         */
        @NameInMap("AccessPageId")
        public String accessPageId;

        /**
         * <strong>example:</strong>
         * <p>notepad_test</p>
         */
        @NameInMap("AccessPageName")
        public String accessPageName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccessPageState")
        public String accessPageState;

        /**
         * <strong>example:</strong>
         * <p>id=a-062wec3cwmayw****&amp;token=9E9A62937B0E41F4AEFE5EC9B238156CCDFB682954003AEE940A05FB2568****</p>
         */
        @NameInMap("AccessUrl")
        public String accessUrl;

        /**
         * <strong>example:</strong>
         * <p>c-05to6wm3w5d53****</p>
         */
        @NameInMap("ContentId")
        public String contentId;

        @NameInMap("ContentName")
        public String contentName;

        /**
         * <strong>example:</strong>
         * <p>168</p>
         */
        @NameInMap("EffectTime")
        public Integer effectTime;

        /**
         * <strong>example:</strong>
         * <p>2023-11-16T08:48:15.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>p-062wec3cwmayu****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>notepad_demo</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>2023-11-23T08:48:15.000+00:00</p>
         */
        @NameInMap("UrlExpireTime")
        public String urlExpireTime;

        public static ListAccessPagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPagesResponseBodyData self = new ListAccessPagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAccessPagesResponseBodyData setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public ListAccessPagesResponseBodyData setAccessPageId(String accessPageId) {
            this.accessPageId = accessPageId;
            return this;
        }
        public String getAccessPageId() {
            return this.accessPageId;
        }

        public ListAccessPagesResponseBodyData setAccessPageName(String accessPageName) {
            this.accessPageName = accessPageName;
            return this;
        }
        public String getAccessPageName() {
            return this.accessPageName;
        }

        public ListAccessPagesResponseBodyData setAccessPageState(String accessPageState) {
            this.accessPageState = accessPageState;
            return this;
        }
        public String getAccessPageState() {
            return this.accessPageState;
        }

        public ListAccessPagesResponseBodyData setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

        public ListAccessPagesResponseBodyData setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }
        public String getContentId() {
            return this.contentId;
        }

        public ListAccessPagesResponseBodyData setContentName(String contentName) {
            this.contentName = contentName;
            return this;
        }
        public String getContentName() {
            return this.contentName;
        }

        public ListAccessPagesResponseBodyData setEffectTime(Integer effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public Integer getEffectTime() {
            return this.effectTime;
        }

        public ListAccessPagesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAccessPagesResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListAccessPagesResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListAccessPagesResponseBodyData setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public ListAccessPagesResponseBodyData setUrlExpireTime(String urlExpireTime) {
            this.urlExpireTime = urlExpireTime;
            return this;
        }
        public String getUrlExpireTime() {
            return this.urlExpireTime;
        }

    }

}
