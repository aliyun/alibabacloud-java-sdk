// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgVulFacetsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Vuls")
    public java.util.List<ListOrgVulFacetsResponseBodyVuls> vuls;

    public static ListOrgVulFacetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgVulFacetsResponseBody self = new ListOrgVulFacetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgVulFacetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgVulFacetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgVulFacetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgVulFacetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgVulFacetsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOrgVulFacetsResponseBody setVuls(java.util.List<ListOrgVulFacetsResponseBodyVuls> vuls) {
        this.vuls = vuls;
        return this;
    }
    public java.util.List<ListOrgVulFacetsResponseBodyVuls> getVuls() {
        return this.vuls;
    }

    public static class ListOrgVulFacetsResponseBodyVuls extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("ModuleID")
        public Integer moduleID;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("Name")
        public String name;

        @NameInMap("Count")
        public Integer count;

        public static ListOrgVulFacetsResponseBodyVuls build(java.util.Map<String, ?> map) throws Exception {
            ListOrgVulFacetsResponseBodyVuls self = new ListOrgVulFacetsResponseBodyVuls();
            return TeaModel.build(map, self);
        }

        public ListOrgVulFacetsResponseBodyVuls setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgVulFacetsResponseBodyVuls setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListOrgVulFacetsResponseBodyVuls setModuleID(Integer moduleID) {
            this.moduleID = moduleID;
            return this;
        }
        public Integer getModuleID() {
            return this.moduleID;
        }

        public ListOrgVulFacetsResponseBodyVuls setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public ListOrgVulFacetsResponseBodyVuls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListOrgVulFacetsResponseBodyVuls setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
