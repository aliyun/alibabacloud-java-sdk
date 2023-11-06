// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackMenuResponseBody extends TeaModel {
    /**
     * <p>The backup information list.</p>
     */
    @NameInMap("List")
    public DescribeBackMenuResponseBodyList list;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackMenuResponseBody self = new DescribeBackMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackMenuResponseBody setList(DescribeBackMenuResponseBodyList list) {
        this.list = list;
        return this;
    }
    public DescribeBackMenuResponseBodyList getList() {
        return this.list;
    }

    public DescribeBackMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackMenuResponseBodyListList extends TeaModel {
        /**
         * <p>The backup method. Valid values:</p>
         * <br>
         * <p>*   **Logic **: logical backup</p>
         * <p>*   **phy**: physical backup</p>
         */
        @NameInMap("MenuName")
        public String menuName;

        /**
         * <p>Indicates whether backup recovery is supported.</p>
         */
        @NameInMap("Support")
        public Boolean support;

        public static DescribeBackMenuResponseBodyListList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackMenuResponseBodyListList self = new DescribeBackMenuResponseBodyListList();
            return TeaModel.build(map, self);
        }

        public DescribeBackMenuResponseBodyListList setMenuName(String menuName) {
            this.menuName = menuName;
            return this;
        }
        public String getMenuName() {
            return this.menuName;
        }

        public DescribeBackMenuResponseBodyListList setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

    public static class DescribeBackMenuResponseBodyList extends TeaModel {
        @NameInMap("list")
        public java.util.List<DescribeBackMenuResponseBodyListList> list;

        public static DescribeBackMenuResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackMenuResponseBodyList self = new DescribeBackMenuResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeBackMenuResponseBodyList setList(java.util.List<DescribeBackMenuResponseBodyListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeBackMenuResponseBodyListList> getList() {
            return this.list;
        }

    }

}
