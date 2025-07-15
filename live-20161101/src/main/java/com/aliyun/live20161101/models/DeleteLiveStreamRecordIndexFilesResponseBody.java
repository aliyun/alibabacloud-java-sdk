// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    /**
     * <p>The status code. A return value of 500 indicates an error. For details, see the Error codes section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status description. A return value of 500 indicates an error. For details, see the Error codes section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The deletion information.</p>
     */
    @NameInMap("RecordDeleteInfoList")
    public DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList recordDeleteInfoList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>939D19EE-59A0-18E9-B458-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveStreamRecordIndexFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamRecordIndexFilesResponseBody self = new DeleteLiveStreamRecordIndexFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamRecordIndexFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteLiveStreamRecordIndexFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLiveStreamRecordIndexFilesResponseBody setRecordDeleteInfoList(DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList recordDeleteInfoList) {
        this.recordDeleteInfoList = recordDeleteInfoList;
        return this;
    }
    public DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList getRecordDeleteInfoList() {
        return this.recordDeleteInfoList;
    }

    public DeleteLiveStreamRecordIndexFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo extends TeaModel {
        /**
         * <p>The processing result of each file indicated by the file ID. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The file has been deleted.</li>
         * <li><strong>AccessDenied</strong>: Access to the file has been denied.</li>
         * <li><strong>FileNotFound</strong>: The file fails to be found.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the index file that is used to locate the live stream recording files to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>c4d7f0a4-b506-43f9-8de3-07732c3f**</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        public static DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo self = new DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo();
            return TeaModel.build(map, self);
        }

        public DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

    }

    public static class DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList extends TeaModel {
        @NameInMap("RecordDeleteInfo")
        public java.util.List<DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo> recordDeleteInfo;

        public static DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList build(java.util.Map<String, ?> map) throws Exception {
            DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList self = new DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList();
            return TeaModel.build(map, self);
        }

        public DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoList setRecordDeleteInfo(java.util.List<DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo> recordDeleteInfo) {
            this.recordDeleteInfo = recordDeleteInfo;
            return this;
        }
        public java.util.List<DeleteLiveStreamRecordIndexFilesResponseBodyRecordDeleteInfoListRecordDeleteInfo> getRecordDeleteInfo() {
            return this.recordDeleteInfo;
        }

    }

}
