// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ListXTelephonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>返回状态码 0000表示成功 其他表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListXTelephonesResponseBodyData data;

    /**
     * <p>返回信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回是否成功 true  表示成功 false表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListXTelephonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListXTelephonesResponseBody self = new ListXTelephonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListXTelephonesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListXTelephonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListXTelephonesResponseBody setData(ListXTelephonesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListXTelephonesResponseBodyData getData() {
        return this.data;
    }

    public ListXTelephonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListXTelephonesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListXTelephonesResponseBodyDataList extends TeaModel {
        /**
         * <p>绑定失败原因</p>
         * 
         * <strong>example:</strong>
         * <p>绑定失败用户身份证黑名单</p>
         */
        @NameInMap("AuthMsg")
        public String authMsg;

        /**
         * <p>绑定时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("BindTime")
        public String bindTime;

        /**
         * <p>购买时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("BuyTime")
        public String buyTime;

        /**
         * <p>客户号码池key</p>
         * 
         * <strong>example:</strong>
         * <p>FC533e6eeb81f4400c87ef3745a21a1a</p>
         */
        @NameInMap("CustomerPoolKey")
        public String customerPoolKey;

        /**
         * <p>号码池名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试号码池</p>
         */
        @NameInMap("CustomerPoolName")
        public String customerPoolName;

        /**
         * <p>释放时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>短信开通状态：0 未开通 1已开通</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsStatus")
        public String smsStatus;

        /**
         * <p>X号码</p>
         * 
         * <strong>example:</strong>
         * <p>17816876546</p>
         */
        @NameInMap("Telephone")
        public String telephone;

        /**
         * <p>号码状态：0 空闲中 1 调拨完成待购买 2购买完成待认证  3 实名认证中  4 实名认证成功  5 认证失败  6 解绑中 7 解绑失败 8已释放 99 超时释放</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TelephoneStatus")
        public String telephoneStatus;

        /**
         * <p>解绑时间</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("UnbindTime")
        public String unbindTime;

        public static ListXTelephonesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListXTelephonesResponseBodyDataList self = new ListXTelephonesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListXTelephonesResponseBodyDataList setAuthMsg(String authMsg) {
            this.authMsg = authMsg;
            return this;
        }
        public String getAuthMsg() {
            return this.authMsg;
        }

        public ListXTelephonesResponseBodyDataList setBindTime(String bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public String getBindTime() {
            return this.bindTime;
        }

        public ListXTelephonesResponseBodyDataList setBuyTime(String buyTime) {
            this.buyTime = buyTime;
            return this;
        }
        public String getBuyTime() {
            return this.buyTime;
        }

        public ListXTelephonesResponseBodyDataList setCustomerPoolKey(String customerPoolKey) {
            this.customerPoolKey = customerPoolKey;
            return this;
        }
        public String getCustomerPoolKey() {
            return this.customerPoolKey;
        }

        public ListXTelephonesResponseBodyDataList setCustomerPoolName(String customerPoolName) {
            this.customerPoolName = customerPoolName;
            return this;
        }
        public String getCustomerPoolName() {
            return this.customerPoolName;
        }

        public ListXTelephonesResponseBodyDataList setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public ListXTelephonesResponseBodyDataList setSmsStatus(String smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public String getSmsStatus() {
            return this.smsStatus;
        }

        public ListXTelephonesResponseBodyDataList setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public ListXTelephonesResponseBodyDataList setTelephoneStatus(String telephoneStatus) {
            this.telephoneStatus = telephoneStatus;
            return this;
        }
        public String getTelephoneStatus() {
            return this.telephoneStatus;
        }

        public ListXTelephonesResponseBodyDataList setUnbindTime(String unbindTime) {
            this.unbindTime = unbindTime;
            return this;
        }
        public String getUnbindTime() {
            return this.unbindTime;
        }

    }

    public static class ListXTelephonesResponseBodyData extends TeaModel {
        /**
         * <p>数据集合</p>
         */
        @NameInMap("List")
        public java.util.List<ListXTelephonesResponseBodyDataList> list;

        /**
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>每页条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>符合查询条件的总数量</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListXTelephonesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListXTelephonesResponseBodyData self = new ListXTelephonesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListXTelephonesResponseBodyData setList(java.util.List<ListXTelephonesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListXTelephonesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListXTelephonesResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public ListXTelephonesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListXTelephonesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
