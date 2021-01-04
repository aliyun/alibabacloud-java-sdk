// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeJianYuTestGetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("Data")
    public DescribeJianYuTestGetResponseBodyData data;

    public static DescribeJianYuTestGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJianYuTestGetResponseBody self = new DescribeJianYuTestGetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJianYuTestGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJianYuTestGetResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeJianYuTestGetResponseBody setData(DescribeJianYuTestGetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeJianYuTestGetResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeJianYuTestGetResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Id")
        public Integer id;

        public static DescribeJianYuTestGetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJianYuTestGetResponseBodyData self = new DescribeJianYuTestGetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJianYuTestGetResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeJianYuTestGetResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
