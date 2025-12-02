// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImageLibResponseBody extends TeaModel {
    /**
     * <p>Error code, consistent with HTTP status.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>List of image library information.</p>
     */
    @NameInMap("LibList")
    public java.util.List<ListImageLibResponseBodyLibList> libList;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageLibResponseBody self = new ListImageLibResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageLibResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListImageLibResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListImageLibResponseBody setLibList(java.util.List<ListImageLibResponseBodyLibList> libList) {
        this.libList = libList;
        return this;
    }
    public java.util.List<ListImageLibResponseBodyLibList> getLibList() {
        return this.libList;
    }

    public ListImageLibResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListImageLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageLibResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImageLibResponseBodyLibList extends TeaModel {
        /**
         * <p>Comment.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Exempt from inspection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FreeInspection")
        public Integer freeInspection;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Number of images in the library.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImageNum")
        public Long imageNum;

        /**
         * <p>Library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>Library name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static ListImageLibResponseBodyLibList build(java.util.Map<String, ?> map) throws Exception {
            ListImageLibResponseBodyLibList self = new ListImageLibResponseBodyLibList();
            return TeaModel.build(map, self);
        }

        public ListImageLibResponseBodyLibList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListImageLibResponseBodyLibList setFreeInspection(Integer freeInspection) {
            this.freeInspection = freeInspection;
            return this;
        }
        public Integer getFreeInspection() {
            return this.freeInspection;
        }

        public ListImageLibResponseBodyLibList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListImageLibResponseBodyLibList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListImageLibResponseBodyLibList setImageNum(Long imageNum) {
            this.imageNum = imageNum;
            return this;
        }
        public Long getImageNum() {
            return this.imageNum;
        }

        public ListImageLibResponseBodyLibList setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public ListImageLibResponseBodyLibList setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

}
