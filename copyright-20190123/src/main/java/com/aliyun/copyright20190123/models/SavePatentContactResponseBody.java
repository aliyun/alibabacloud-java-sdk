// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SavePatentContactResponseBody extends TeaModel {
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
    public java.util.List<SavePatentContactResponseBodyData> data;

    public static SavePatentContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SavePatentContactResponseBody self = new SavePatentContactResponseBody();
        return TeaModel.build(map, self);
    }

    public SavePatentContactResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public SavePatentContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SavePatentContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SavePatentContactResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public SavePatentContactResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SavePatentContactResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public SavePatentContactResponseBody setData(java.util.List<SavePatentContactResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SavePatentContactResponseBodyData> getData() {
        return this.data;
    }

    public static class SavePatentContactResponseBodyData extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Id")
        public Long id;

        public static SavePatentContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SavePatentContactResponseBodyData self = new SavePatentContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SavePatentContactResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SavePatentContactResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SavePatentContactResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public SavePatentContactResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
