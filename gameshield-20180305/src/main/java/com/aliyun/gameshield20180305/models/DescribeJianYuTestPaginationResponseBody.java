// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeJianYuTestPaginationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("List")
    public java.util.List<DescribeJianYuTestPaginationResponseBodyList> list;

    public static DescribeJianYuTestPaginationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJianYuTestPaginationResponseBody self = new DescribeJianYuTestPaginationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJianYuTestPaginationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJianYuTestPaginationResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeJianYuTestPaginationResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeJianYuTestPaginationResponseBody setList(java.util.List<DescribeJianYuTestPaginationResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeJianYuTestPaginationResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeJianYuTestPaginationResponseBodyList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Integer id;

        public static DescribeJianYuTestPaginationResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeJianYuTestPaginationResponseBodyList self = new DescribeJianYuTestPaginationResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeJianYuTestPaginationResponseBodyList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeJianYuTestPaginationResponseBodyList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
