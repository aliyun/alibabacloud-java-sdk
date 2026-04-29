// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListExtenResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListExtenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListExtenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListExtenResponseBody self = new CloudListExtenResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListExtenResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListExtenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListExtenResponseBody setData(CloudListExtenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListExtenResponseBodyData getData() {
        return this.data;
    }

    public CloudListExtenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListExtenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListExtenResponseBodyDataList extends TeaModel {
        /**
         * <p>允许的语音编码,支持格式: 1. g729 2. g729,alaw,ulaw 3. alaw,ulaw,g729 4. alaw,ulaw 5. myopus,alaw,ulaw 公网+远程话机支持配置1/2/3;专线+远程话机支持配置1/2;公网+软电话支持配置4;专线+软电话支持配置5;</p>
         * 
         * <strong>example:</strong>
         * <p>alaw,ulaw</p>
         */
        @NameInMap("Allow")
        public String allow;

        /**
         * <p>区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallPower")
        public String callPower;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-30 06:09:02</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>降噪开关 0:关闭 1:开启 默认关闭(该参数只有在类型为注册到webrtc才有效)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Denoise")
        public Long denoise;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>分机号,3-11位</p>
         * 
         * <strong>example:</strong>
         * <p>66749</p>
         */
        @NameInMap("Exten")
        public String exten;

        /**
         * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbRecord")
        public Long ibRecord;

        /**
         * <p>分机号id</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>是否允许摘机外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDirect")
        public Long isDirect;

        /**
         * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsOb")
        public Long isOb;

        /**
         * <p>网络防抖</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JitterBuffer")
        public Long jitterBuffer;

        /**
         * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObRecord")
        public Long obRecord;

        /**
         * <p>密码</p>
         * 
         * <strong>example:</strong>
         * <p>Aa626670</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>类型，1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Long type;

        public static CloudListExtenResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListExtenResponseBodyDataList self = new CloudListExtenResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListExtenResponseBodyDataList setAllow(String allow) {
            this.allow = allow;
            return this;
        }
        public String getAllow() {
            return this.allow;
        }

        public CloudListExtenResponseBodyDataList setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudListExtenResponseBodyDataList setCallPower(String callPower) {
            this.callPower = callPower;
            return this;
        }
        public String getCallPower() {
            return this.callPower;
        }

        public CloudListExtenResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListExtenResponseBodyDataList setDenoise(Long denoise) {
            this.denoise = denoise;
            return this;
        }
        public Long getDenoise() {
            return this.denoise;
        }

        public CloudListExtenResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListExtenResponseBodyDataList setExten(String exten) {
            this.exten = exten;
            return this;
        }
        public String getExten() {
            return this.exten;
        }

        public CloudListExtenResponseBodyDataList setIbRecord(Long ibRecord) {
            this.ibRecord = ibRecord;
            return this;
        }
        public Long getIbRecord() {
            return this.ibRecord;
        }

        public CloudListExtenResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudListExtenResponseBodyDataList setIsDirect(Long isDirect) {
            this.isDirect = isDirect;
            return this;
        }
        public Long getIsDirect() {
            return this.isDirect;
        }

        public CloudListExtenResponseBodyDataList setIsOb(Long isOb) {
            this.isOb = isOb;
            return this;
        }
        public Long getIsOb() {
            return this.isOb;
        }

        public CloudListExtenResponseBodyDataList setJitterBuffer(Long jitterBuffer) {
            this.jitterBuffer = jitterBuffer;
            return this;
        }
        public Long getJitterBuffer() {
            return this.jitterBuffer;
        }

        public CloudListExtenResponseBodyDataList setObRecord(Long obRecord) {
            this.obRecord = obRecord;
            return this;
        }
        public Long getObRecord() {
            return this.obRecord;
        }

        public CloudListExtenResponseBodyDataList setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CloudListExtenResponseBodyDataList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class CloudListExtenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EndRow")
        public String endRow;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FirstPage")
        public String firstPage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasNextPage")
        public Long hasNextPage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasPreviousPage")
        public Long hasPreviousPage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFirstPage")
        public Long isFirstPage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLastPage")
        public Long isLastPage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LastPage")
        public String lastPage;

        @NameInMap("List")
        public java.util.List<CloudListExtenResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("NavigatePages")
        public String navigatePages;

        @NameInMap("NavigatepageNums")
        public java.util.List<String> navigatepageNums;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NextPage")
        public String nextPage;

        /**
         * <strong>example:</strong>
         * <p>exten</p>
         */
        @NameInMap("OrderBy")
        public String orderBy;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public String pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pages")
        public String pages;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PrePage")
        public String prePage;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartRow")
        public String startRow;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public String total;

        public static CloudListExtenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListExtenResponseBodyData self = new CloudListExtenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListExtenResponseBodyData setEndRow(String endRow) {
            this.endRow = endRow;
            return this;
        }
        public String getEndRow() {
            return this.endRow;
        }

        public CloudListExtenResponseBodyData setFirstPage(String firstPage) {
            this.firstPage = firstPage;
            return this;
        }
        public String getFirstPage() {
            return this.firstPage;
        }

        public CloudListExtenResponseBodyData setHasNextPage(Long hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Long getHasNextPage() {
            return this.hasNextPage;
        }

        public CloudListExtenResponseBodyData setHasPreviousPage(Long hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }
        public Long getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public CloudListExtenResponseBodyData setIsFirstPage(Long isFirstPage) {
            this.isFirstPage = isFirstPage;
            return this;
        }
        public Long getIsFirstPage() {
            return this.isFirstPage;
        }

        public CloudListExtenResponseBodyData setIsLastPage(Long isLastPage) {
            this.isLastPage = isLastPage;
            return this;
        }
        public Long getIsLastPage() {
            return this.isLastPage;
        }

        public CloudListExtenResponseBodyData setLastPage(String lastPage) {
            this.lastPage = lastPage;
            return this;
        }
        public String getLastPage() {
            return this.lastPage;
        }

        public CloudListExtenResponseBodyData setList(java.util.List<CloudListExtenResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListExtenResponseBodyDataList> getList() {
            return this.list;
        }

        public CloudListExtenResponseBodyData setNavigatePages(String navigatePages) {
            this.navigatePages = navigatePages;
            return this;
        }
        public String getNavigatePages() {
            return this.navigatePages;
        }

        public CloudListExtenResponseBodyData setNavigatepageNums(java.util.List<String> navigatepageNums) {
            this.navigatepageNums = navigatepageNums;
            return this;
        }
        public java.util.List<String> getNavigatepageNums() {
            return this.navigatepageNums;
        }

        public CloudListExtenResponseBodyData setNextPage(String nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public String getNextPage() {
            return this.nextPage;
        }

        public CloudListExtenResponseBodyData setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public String getOrderBy() {
            return this.orderBy;
        }

        public CloudListExtenResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public CloudListExtenResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public CloudListExtenResponseBodyData setPages(String pages) {
            this.pages = pages;
            return this;
        }
        public String getPages() {
            return this.pages;
        }

        public CloudListExtenResponseBodyData setPrePage(String prePage) {
            this.prePage = prePage;
            return this;
        }
        public String getPrePage() {
            return this.prePage;
        }

        public CloudListExtenResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public CloudListExtenResponseBodyData setStartRow(String startRow) {
            this.startRow = startRow;
            return this;
        }
        public String getStartRow() {
            return this.startRow;
        }

        public CloudListExtenResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
