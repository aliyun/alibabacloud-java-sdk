// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddFilesFromAuthorizedOssResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Cant find out category for category_id param.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static AddFilesFromAuthorizedOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFilesFromAuthorizedOssResponseBody self = new AddFilesFromAuthorizedOssResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFilesFromAuthorizedOssResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFilesFromAuthorizedOssResponseBody setData(AddFilesFromAuthorizedOssResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFilesFromAuthorizedOssResponseBodyData getData() {
        return this.data;
    }

    public AddFilesFromAuthorizedOssResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddFilesFromAuthorizedOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFilesFromAuthorizedOssResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddFilesFromAuthorizedOssResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>file_809f469a59ac449586ec692576xxxxx_102248XXX</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <strong>example:</strong>
         * <p>size too large</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>root/path/this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList build(java.util.Map<String, ?> map) throws Exception {
            AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList self = new AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList();
            return TeaModel.build(map, self);
        }

        public AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class AddFilesFromAuthorizedOssResponseBodyData extends TeaModel {
        @NameInMap("AddFileResultList")
        public java.util.List<AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList> addFileResultList;

        public static AddFilesFromAuthorizedOssResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFilesFromAuthorizedOssResponseBodyData self = new AddFilesFromAuthorizedOssResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFilesFromAuthorizedOssResponseBodyData setAddFileResultList(java.util.List<AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList> addFileResultList) {
            this.addFileResultList = addFileResultList;
            return this;
        }
        public java.util.List<AddFilesFromAuthorizedOssResponseBodyDataAddFileResultList> getAddFileResultList() {
            return this.addFileResultList;
        }

    }

}
