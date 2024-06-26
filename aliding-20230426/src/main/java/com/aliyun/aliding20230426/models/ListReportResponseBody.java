// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListReportResponseBody extends TeaModel {
    @NameInMap("dataList")
    public java.util.List<ListReportResponseBodyDataList> dataList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <strong>example:</strong>
     * <p>12312131231</p>
     */
    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Long size;

    public static ListReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReportResponseBody self = new ListReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReportResponseBody setDataList(java.util.List<ListReportResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListReportResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListReportResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListReportResponseBody setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Long getNextCursor() {
        return this.nextCursor;
    }

    public ListReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReportResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public static class ListReportResponseBodyDataListContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sort")
        public String sort;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>ce9ab5d4a80a9401f97c7077e6a9634bd</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListReportResponseBodyDataListContents build(java.util.Map<String, ?> map) throws Exception {
            ListReportResponseBodyDataListContents self = new ListReportResponseBodyDataListContents();
            return TeaModel.build(map, self);
        }

        public ListReportResponseBodyDataListContents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListReportResponseBodyDataListContents setSort(String sort) {
            this.sort = sort;
            return this;
        }
        public String getSort() {
            return this.sort;
        }

        public ListReportResponseBodyDataListContents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListReportResponseBodyDataListContents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListReportResponseBodyDataList extends TeaModel {
        @NameInMap("Contents")
        public java.util.List<ListReportResponseBodyDataListContents> contents;

        /**
         * <strong>example:</strong>
         * <p>1678416166000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1127123</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <strong>example:</strong>
         * <p>31.1264</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>108.938036</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        /**
         * <strong>example:</strong>
         * <p>1653543540000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>d64994d09916c76276dd9bfa23637644</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        @NameInMap("TemplateName")
        public String templateName;

        public static ListReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListReportResponseBodyDataList self = new ListReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListReportResponseBodyDataList setContents(java.util.List<ListReportResponseBodyDataListContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<ListReportResponseBodyDataListContents> getContents() {
            return this.contents;
        }

        public ListReportResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListReportResponseBodyDataList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListReportResponseBodyDataList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListReportResponseBodyDataList setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public ListReportResponseBodyDataList setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public ListReportResponseBodyDataList setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListReportResponseBodyDataList setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListReportResponseBodyDataList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListReportResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListReportResponseBodyDataList setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListReportResponseBodyDataList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
