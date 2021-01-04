// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeJianYuTestListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("List")
    public java.util.List<DescribeJianYuTestListResponseBodyList> list;

    public static DescribeJianYuTestListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJianYuTestListResponseBody self = new DescribeJianYuTestListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJianYuTestListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJianYuTestListResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeJianYuTestListResponseBody setList(java.util.List<DescribeJianYuTestListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeJianYuTestListResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeJianYuTestListResponseBodyList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Integer id;

        public static DescribeJianYuTestListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeJianYuTestListResponseBodyList self = new DescribeJianYuTestListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeJianYuTestListResponseBodyList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeJianYuTestListResponseBodyList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
