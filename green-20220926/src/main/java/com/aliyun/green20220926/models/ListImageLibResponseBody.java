// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImageLibResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LibList")
    public java.util.List<ListImageLibResponseBodyLibList> libList;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FreeInspection")
        public Integer freeInspection;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ImageNum")
        public Long imageNum;

        /**
         * <strong>example:</strong>
         * <p>custom_xxxx</p>
         */
        @NameInMap("LibId")
        public String libId;

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
