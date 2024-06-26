// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeRdMemberListResponseBody extends TeaModel {
    @NameInMap("MemberList")
    public java.util.List<DescribeRdMemberListResponseBodyMemberList> memberList;

    /**
     * <strong>example:</strong>
     * <p>DC245DEE-9800-5579-BF99-189D6A5BA9FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeRdMemberListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdMemberListResponseBody self = new DescribeRdMemberListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdMemberListResponseBody setMemberList(java.util.List<DescribeRdMemberListResponseBodyMemberList> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<DescribeRdMemberListResponseBodyMemberList> getMemberList() {
        return this.memberList;
    }

    public DescribeRdMemberListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdMemberListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeRdMemberListResponseBodyMemberList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1624954942000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1960279802016267</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeRdMemberListResponseBodyMemberList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdMemberListResponseBodyMemberList self = new DescribeRdMemberListResponseBodyMemberList();
            return TeaModel.build(map, self);
        }

        public DescribeRdMemberListResponseBodyMemberList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRdMemberListResponseBodyMemberList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRdMemberListResponseBodyMemberList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
