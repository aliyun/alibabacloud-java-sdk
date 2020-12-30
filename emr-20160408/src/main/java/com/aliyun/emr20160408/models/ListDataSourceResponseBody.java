// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListDataSourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("DataSourceList")
    public ListDataSourceResponseBodyDataSourceList dataSourceList;

    public static ListDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponseBody self = new ListDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListDataSourceResponseBody setDataSourceList(ListDataSourceResponseBodyDataSourceList dataSourceList) {
        this.dataSourceList = dataSourceList;
        return this;
    }
    public ListDataSourceResponseBodyDataSourceList getDataSourceList() {
        return this.dataSourceList;
    }

    public static class ListDataSourceResponseBodyDataSourceListDataSource extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Conf")
        public String conf;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("CreateFrom")
        public String createFrom;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ListDataSourceResponseBodyDataSourceListDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyDataSourceListDataSource self = new ListDataSourceResponseBodyDataSourceListDataSource();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setConf(String conf) {
            this.conf = conf;
            return this;
        }
        public String getConf() {
            return this.conf;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setCreateFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }
        public String getCreateFrom() {
            return this.createFrom;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDataSourceResponseBodyDataSourceListDataSource setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ListDataSourceResponseBodyDataSourceList extends TeaModel {
        @NameInMap("DataSource")
        public java.util.List<ListDataSourceResponseBodyDataSourceListDataSource> dataSource;

        public static ListDataSourceResponseBodyDataSourceList build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceResponseBodyDataSourceList self = new ListDataSourceResponseBodyDataSourceList();
            return TeaModel.build(map, self);
        }

        public ListDataSourceResponseBodyDataSourceList setDataSource(java.util.List<ListDataSourceResponseBodyDataSourceListDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<ListDataSourceResponseBodyDataSourceListDataSource> getDataSource() {
            return this.dataSource;
        }

    }

}
