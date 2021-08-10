// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListPatentContactResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<ListPatentContactResponseBodyData> data;

    public static ListPatentContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPatentContactResponseBody self = new ListPatentContactResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPatentContactResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPatentContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPatentContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPatentContactResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListPatentContactResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPatentContactResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public ListPatentContactResponseBody setData(java.util.List<ListPatentContactResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPatentContactResponseBodyData> getData() {
        return this.data;
    }

    public static class ListPatentContactResponseBodyData extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Id")
        public Long id;

        public static ListPatentContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPatentContactResponseBodyData self = new ListPatentContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPatentContactResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListPatentContactResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPatentContactResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListPatentContactResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
