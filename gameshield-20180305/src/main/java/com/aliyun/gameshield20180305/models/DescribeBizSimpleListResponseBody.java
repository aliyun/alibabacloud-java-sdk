// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBizSimpleListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("BizSimpleList")
    public java.util.List<DescribeBizSimpleListResponseBodyBizSimpleList> bizSimpleList;

    public static DescribeBizSimpleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizSimpleListResponseBody self = new DescribeBizSimpleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizSimpleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizSimpleListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeBizSimpleListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeBizSimpleListResponseBody setBizSimpleList(java.util.List<DescribeBizSimpleListResponseBodyBizSimpleList> bizSimpleList) {
        this.bizSimpleList = bizSimpleList;
        return this;
    }
    public java.util.List<DescribeBizSimpleListResponseBodyBizSimpleList> getBizSimpleList() {
        return this.bizSimpleList;
    }

    public static class DescribeBizSimpleListResponseBodyBizSimpleList extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("NgGroupId")
        public String ngGroupId;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("UseCc")
        public Integer useCc;

        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("EsnBizId")
        public String esnBizId;

        @NameInMap("CcQps")
        public Integer ccQps;

        public static DescribeBizSimpleListResponseBodyBizSimpleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizSimpleListResponseBodyBizSimpleList self = new DescribeBizSimpleListResponseBodyBizSimpleList();
            return TeaModel.build(map, self);
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setNgGroupId(String ngGroupId) {
            this.ngGroupId = ngGroupId;
            return this;
        }
        public String getNgGroupId() {
            return this.ngGroupId;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setUseCc(Integer useCc) {
            this.useCc = useCc;
            return this;
        }
        public Integer getUseCc() {
            return this.useCc;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

        public DescribeBizSimpleListResponseBodyBizSimpleList setCcQps(Integer ccQps) {
            this.ccQps = ccQps;
            return this;
        }
        public Integer getCcQps() {
            return this.ccQps;
        }

    }

}
