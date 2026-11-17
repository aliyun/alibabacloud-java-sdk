// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRelatedResourceResponseBody extends TeaModel {
    /**
     * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public ListRelatedResourceResponseBodyData data;

    /**
     * <p>The description of the request processing result. The value <code>success</code> is typically returned when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRelatedResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRelatedResourceResponseBody self = new ListRelatedResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRelatedResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRelatedResourceResponseBody setData(ListRelatedResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRelatedResourceResponseBodyData getData() {
        return this.data;
    }

    public ListRelatedResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRelatedResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRelatedResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRelatedResourceResponseBodyData extends TeaModel {
        /**
         * <p>The number of cloud desktops associated with the image.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Integer desktopCount;

        /**
         * <p>The number of cloud desktop pools associated with the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        /**
         * <p>The number of associated templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateCount")
        public Integer templateCount;

        public static ListRelatedResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRelatedResourceResponseBodyData self = new ListRelatedResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRelatedResourceResponseBodyData setDesktopCount(Integer desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Integer getDesktopCount() {
            return this.desktopCount;
        }

        public ListRelatedResourceResponseBodyData setDesktopGroupCount(Integer desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public ListRelatedResourceResponseBodyData setTemplateCount(Integer templateCount) {
            this.templateCount = templateCount;
            return this;
        }
        public Integer getTemplateCount() {
            return this.templateCount;
        }

    }

}
