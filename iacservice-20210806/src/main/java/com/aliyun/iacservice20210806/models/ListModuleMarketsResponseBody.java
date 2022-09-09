// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModuleMarketsResponseBody extends TeaModel {
    @NameInMap("moduleMarkets")
    public java.util.List<ListModuleMarketsResponseBodyModuleMarkets> moduleMarkets;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListModuleMarketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModuleMarketsResponseBody self = new ListModuleMarketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModuleMarketsResponseBody setModuleMarkets(java.util.List<ListModuleMarketsResponseBodyModuleMarkets> moduleMarkets) {
        this.moduleMarkets = moduleMarkets;
        return this;
    }
    public java.util.List<ListModuleMarketsResponseBodyModuleMarkets> getModuleMarkets() {
        return this.moduleMarkets;
    }

    public ListModuleMarketsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModuleMarketsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModuleMarketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModuleMarketsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModuleMarketsResponseBodyModuleMarkets extends TeaModel {
        @NameInMap("cloneCount")
        public Integer cloneCount;

        @NameInMap("codeUrl")
        public String codeUrl;

        @NameInMap("config")
        public java.util.Map<String, String> config;

        @NameInMap("description")
        public String description;

        @NameInMap("message")
        public String message;

        @NameInMap("moduleDetail")
        public String moduleDetail;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleMarketId")
        public String moduleMarketId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("relatedId")
        public Long relatedId;

        @NameInMap("status")
        public String status;

        public static ListModuleMarketsResponseBodyModuleMarkets build(java.util.Map<String, ?> map) throws Exception {
            ListModuleMarketsResponseBodyModuleMarkets self = new ListModuleMarketsResponseBodyModuleMarkets();
            return TeaModel.build(map, self);
        }

        public ListModuleMarketsResponseBodyModuleMarkets setCloneCount(Integer cloneCount) {
            this.cloneCount = cloneCount;
            return this;
        }
        public Integer getCloneCount() {
            return this.cloneCount;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setCodeUrl(String codeUrl) {
            this.codeUrl = codeUrl;
            return this;
        }
        public String getCodeUrl() {
            return this.codeUrl;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setModuleDetail(String moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public String getModuleDetail() {
            return this.moduleDetail;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setModuleMarketId(String moduleMarketId) {
            this.moduleMarketId = moduleMarketId;
            return this;
        }
        public String getModuleMarketId() {
            return this.moduleMarketId;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setRelatedId(Long relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public Long getRelatedId() {
            return this.relatedId;
        }

        public ListModuleMarketsResponseBodyModuleMarkets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
