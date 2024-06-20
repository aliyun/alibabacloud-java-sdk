// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesResponseBody extends TeaModel {
    @NameInMap("audioList")
    public java.util.List<QueryMinutesResponseBodyAudioList> audioList;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static QueryMinutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesResponseBody self = new QueryMinutesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMinutesResponseBody setAudioList(java.util.List<QueryMinutesResponseBodyAudioList> audioList) {
        this.audioList = audioList;
        return this;
    }
    public java.util.List<QueryMinutesResponseBodyAudioList> getAudioList() {
        return this.audioList;
    }

    public QueryMinutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMinutesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryMinutesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryMinutesResponseBodyAudioList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1127942</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx-hangzhou.oss-cn-hangzhou.aliyuncs.com/record_xxxx.mp3?Expires=1718045081&OSSAccessKeyId=TMP.3KdwHtvZxopmwacMZEdyb4WHLVmbArrNRB9CTKnR1MaJgmRjdmZczs6Rip66cgKgk2HhQon1yygvBnbY3uqEaZNeHBLcBa&Signature=OFWyAIY%2FdlzfwM9wIfEaKoAudkxxxxx">https://xxx-hangzhou.oss-cn-hangzhou.aliyuncs.com/record_xxxx.mp3?Expires=1718045081&amp;OSSAccessKeyId=TMP.3KdwHtvZxopmwacMZEdyb4WHLVmbArrNRB9CTKnR1MaJgmRjdmZczs6Rip66cgKgk2HhQon1yygvBnbY3uqEaZNeHBLcBa&amp;Signature=OFWyAIY%2FdlzfwM9wIfEaKoAudkxxxxx</a></p>
         */
        @NameInMap("PlayUrl")
        public String playUrl;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryMinutesResponseBodyAudioList build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesResponseBodyAudioList self = new QueryMinutesResponseBodyAudioList();
            return TeaModel.build(map, self);
        }

        public QueryMinutesResponseBodyAudioList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryMinutesResponseBodyAudioList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryMinutesResponseBodyAudioList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public QueryMinutesResponseBodyAudioList setPlayUrl(String playUrl) {
            this.playUrl = playUrl;
            return this;
        }
        public String getPlayUrl() {
            return this.playUrl;
        }

        public QueryMinutesResponseBodyAudioList setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public QueryMinutesResponseBodyAudioList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryMinutesResponseBodyAudioList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
