// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeBizListResponseBody extends TeaModel {
    @NameInMap("BizList")
    public java.util.List<DescribeBizListResponseBodyBizList> bizList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeBizListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizListResponseBody self = new DescribeBizListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBizListResponseBody setBizList(java.util.List<DescribeBizListResponseBodyBizList> bizList) {
        this.bizList = bizList;
        return this;
    }
    public java.util.List<DescribeBizListResponseBodyBizList> getBizList() {
        return this.bizList;
    }

    public DescribeBizListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBizListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeBizListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeBizListResponseBodyBizList extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("NodeInUseNum")
        public Integer nodeInUseNum;

        @NameInMap("NgGroupId")
        public String ngGroupId;

        @NameInMap("UseCc")
        public Integer useCc;

        @NameInMap("BizId")
        public Long bizId;

        @NameInMap("GroupNum")
        public Integer groupNum;

        @NameInMap("NodeUnUseNum")
        public Integer nodeUnUseNum;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("EsnBizId")
        public String esnBizId;

        @NameInMap("CcQps")
        public Integer ccQps;

        public static DescribeBizListResponseBodyBizList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBizListResponseBodyBizList self = new DescribeBizListResponseBodyBizList();
            return TeaModel.build(map, self);
        }

        public DescribeBizListResponseBodyBizList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeBizListResponseBodyBizList setNodeInUseNum(Integer nodeInUseNum) {
            this.nodeInUseNum = nodeInUseNum;
            return this;
        }
        public Integer getNodeInUseNum() {
            return this.nodeInUseNum;
        }

        public DescribeBizListResponseBodyBizList setNgGroupId(String ngGroupId) {
            this.ngGroupId = ngGroupId;
            return this;
        }
        public String getNgGroupId() {
            return this.ngGroupId;
        }

        public DescribeBizListResponseBodyBizList setUseCc(Integer useCc) {
            this.useCc = useCc;
            return this;
        }
        public Integer getUseCc() {
            return this.useCc;
        }

        public DescribeBizListResponseBodyBizList setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public DescribeBizListResponseBodyBizList setGroupNum(Integer groupNum) {
            this.groupNum = groupNum;
            return this;
        }
        public Integer getGroupNum() {
            return this.groupNum;
        }

        public DescribeBizListResponseBodyBizList setNodeUnUseNum(Integer nodeUnUseNum) {
            this.nodeUnUseNum = nodeUnUseNum;
            return this;
        }
        public Integer getNodeUnUseNum() {
            return this.nodeUnUseNum;
        }

        public DescribeBizListResponseBodyBizList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeBizListResponseBodyBizList setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeBizListResponseBodyBizList setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeBizListResponseBodyBizList setEsnBizId(String esnBizId) {
            this.esnBizId = esnBizId;
            return this;
        }
        public String getEsnBizId() {
            return this.esnBizId;
        }

        public DescribeBizListResponseBodyBizList setCcQps(Integer ccQps) {
            this.ccQps = ccQps;
            return this;
        }
        public Integer getCcQps() {
            return this.ccQps;
        }

    }

}
