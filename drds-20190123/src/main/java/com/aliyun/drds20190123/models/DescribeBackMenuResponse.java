// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackMenuResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("List")
    @Validation(required = true)
    public DescribeBackMenuResponseList list;

    public static DescribeBackMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackMenuResponse self = new DescribeBackMenuResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackMenuResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackMenuResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackMenuResponse setList(DescribeBackMenuResponseList list) {
        this.list = list;
        return this;
    }
    public DescribeBackMenuResponseList getList() {
        return this.list;
    }

    public static class DescribeBackMenuResponseListList extends TeaModel {
        @NameInMap("MenuName")
        @Validation(required = true)
        public String menuName;

        @NameInMap("Support")
        @Validation(required = true)
        public Boolean support;

        public static DescribeBackMenuResponseListList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackMenuResponseListList self = new DescribeBackMenuResponseListList();
            return TeaModel.build(map, self);
        }

        public DescribeBackMenuResponseListList setMenuName(String menuName) {
            this.menuName = menuName;
            return this;
        }
        public String getMenuName() {
            return this.menuName;
        }

        public DescribeBackMenuResponseListList setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

    public static class DescribeBackMenuResponseList extends TeaModel {
        @NameInMap("list")
        @Validation(required = true)
        public java.util.List<DescribeBackMenuResponseListList> list;

        public static DescribeBackMenuResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackMenuResponseList self = new DescribeBackMenuResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeBackMenuResponseList setList(java.util.List<DescribeBackMenuResponseListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeBackMenuResponseListList> getList() {
            return this.list;
        }

    }

}
