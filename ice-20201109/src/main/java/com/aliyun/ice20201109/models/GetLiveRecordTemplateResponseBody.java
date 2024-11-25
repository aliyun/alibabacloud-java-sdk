// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateResponseBody extends TeaModel {
    /**
     * <p>The recording template.</p>
     */
    @NameInMap("RecordTemplate")
    public GetLiveRecordTemplateResponseBodyRecordTemplate recordTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C892855F-95DF-50D6-A28C-279ABDB76810</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordTemplateResponseBody self = new GetLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordTemplateResponseBody setRecordTemplate(GetLiveRecordTemplateResponseBodyRecordTemplate recordTemplate) {
        this.recordTemplate = recordTemplate;
        return this;
    }
    public GetLiveRecordTemplateResponseBodyRecordTemplate getRecordTemplate() {
        return this.recordTemplate;
    }

    public GetLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList extends TeaModel {
        /**
         * <p>The duration of the recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("CycleDuration")
        public Integer cycleDuration;

        /**
         * <p>The output file format.</p>
         * 
         * <strong>example:</strong>
         * <p>m3u8</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The name of the recording file that is stored in Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{Sequence}{EscapedStartTime}{EscapedEndTime}</p>
         */
        @NameInMap("OssObjectPrefix")
        public String ossObjectPrefix;

        /**
         * <p>The duration of a single segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SliceDuration")
        public Integer sliceDuration;

        /**
         * <p>The name of the TS segment.</p>
         * 
         * <strong>example:</strong>
         * <p>record/{JobId}/{UnixTimestamp}_{Sequence}</p>
         */
        @NameInMap("SliceOssObjectPrefix")
        public String sliceOssObjectPrefix;

        public static GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList self = new GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setCycleDuration(Integer cycleDuration) {
            this.cycleDuration = cycleDuration;
            return this;
        }
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setOssObjectPrefix(String ossObjectPrefix) {
            this.ossObjectPrefix = ossObjectPrefix;
            return this;
        }
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setSliceDuration(Integer sliceDuration) {
            this.sliceDuration = sliceDuration;
            return this;
        }
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
            this.sliceOssObjectPrefix = sliceOssObjectPrefix;
            return this;
        }
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

    }

    public static class GetLiveRecordTemplateResponseBodyRecordTemplate extends TeaModel {
        /**
         * <p>The time when the job was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T03:26:36Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the template was last modified.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T03:26:36Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of recording formats.</p>
         */
        @NameInMap("RecordFormatList")
        public java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> recordFormatList;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of the template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetLiveRecordTemplateResponseBodyRecordTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyRecordTemplate self = new GetLiveRecordTemplateResponseBodyRecordTemplate();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setRecordFormatList(java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> recordFormatList) {
            this.recordFormatList = recordFormatList;
            return this;
        }
        public java.util.List<GetLiveRecordTemplateResponseBodyRecordTemplateRecordFormatList> getRecordFormatList() {
            return this.recordFormatList;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetLiveRecordTemplateResponseBodyRecordTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
