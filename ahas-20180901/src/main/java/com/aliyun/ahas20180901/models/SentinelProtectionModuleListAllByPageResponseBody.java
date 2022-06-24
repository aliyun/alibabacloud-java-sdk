// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleListAllByPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelProtectionModuleListAllByPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Long totalPage;

    public static SentinelProtectionModuleListAllByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleListAllByPageResponseBody self = new SentinelProtectionModuleListAllByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleListAllByPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setData(SentinelProtectionModuleListAllByPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelProtectionModuleListAllByPageResponseBodyData getData() {
        return this.data;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public SentinelProtectionModuleListAllByPageResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class SentinelProtectionModuleListAllByPageResponseBodyDataDatas extends TeaModel {
        @NameInMap("fallbackId")
        public Long fallbackId;

        @NameInMap("fallbackObject")
        public String fallbackObject;

        @NameInMap("ruleId")
        public Long ruleId;

        @NameInMap("ruleObject")
        public String ruleObject;

        @NameInMap("ruleType")
        public Long ruleType;

        public static SentinelProtectionModuleListAllByPageResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            SentinelProtectionModuleListAllByPageResponseBodyDataDatas self = new SentinelProtectionModuleListAllByPageResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public SentinelProtectionModuleListAllByPageResponseBodyDataDatas setFallbackId(Long fallbackId) {
            this.fallbackId = fallbackId;
            return this;
        }
        public Long getFallbackId() {
            return this.fallbackId;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyDataDatas setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyDataDatas setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyDataDatas setRuleObject(String ruleObject) {
            this.ruleObject = ruleObject;
            return this;
        }
        public String getRuleObject() {
            return this.ruleObject;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyDataDatas setRuleType(Long ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Long getRuleType() {
            return this.ruleType;
        }

    }

    public static class SentinelProtectionModuleListAllByPageResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public java.util.List<SentinelProtectionModuleListAllByPageResponseBodyDataDatas> datas;

        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static SentinelProtectionModuleListAllByPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelProtectionModuleListAllByPageResponseBodyData self = new SentinelProtectionModuleListAllByPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelProtectionModuleListAllByPageResponseBodyData setDatas(java.util.List<SentinelProtectionModuleListAllByPageResponseBodyDataDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<SentinelProtectionModuleListAllByPageResponseBodyDataDatas> getDatas() {
            return this.datas;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SentinelProtectionModuleListAllByPageResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
