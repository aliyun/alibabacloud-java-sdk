// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ListXTelephonesResponseBody extends TeaModel {
    /**
     * <p>The details of the access denied error.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code. Valid values:</p>
     * <ul>
     * <li><p>0000: Success.</p>
     * </li>
     * <li><p>Other values: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data collection.</p>
     */
    @NameInMap("Data")
    public ListXTelephonesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: Success.</p>
     * </li>
     * <li><p>false: Failure.</p>
     * </li>
     * </ul>
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
         * <p>The reason for binding failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Binding failed: user ID card blacklisted</p>
         */
        @NameInMap("AuthMsg")
        public String authMsg;

        /**
         * <p>The binding time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("BindTime")
        public String bindTime;

        /**
         * <p>The purchase time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("BuyTime")
        public String buyTime;

        /**
         * <p>The customer number pool key.</p>
         * 
         * <strong>example:</strong>
         * <p>FC533e6eeb81f4400c87ef3745a21a1a</p>
         */
        @NameInMap("CustomerPoolKey")
        public String customerPoolKey;

        /**
         * <p>The number pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test number pool</p>
         */
        @NameInMap("CustomerPoolName")
        public String customerPoolName;

        /**
         * <p>The release time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-29 17:23:58</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        /**
         * <p>The SMS activation status. Valid values:</p>
         * <ul>
         * <li>0: Not activated.</li>
         * <li>1: Activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsStatus")
        public String smsStatus;

        /**
         * <p>The X number.</p>
         * 
         * <strong>example:</strong>
         * <p>17816876546</p>
         */
        @NameInMap("Telephone")
        public String telephone;

        /**
         * <p>The number status. Valid values:</p>
         * <ul>
         * <li>0: Idle.</li>
         * <li>1: Allocation completed and pending purchase.</li>
         * <li>2: Purchase completed and pending verification.</li>
         * <li>3: Real-name verification in progress.</li>
         * <li>4: Real-name verification succeeded.</li>
         * <li>5: Verification failed.</li>
         * <li>6: Unbinding in progress.</li>
         * <li>7: Unbinding failed.</li>
         * <li>8: Released.</li>
         * <li>99: Released due to timeout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TelephoneStatus")
        public String telephoneStatus;

        /**
         * <p>The unbinding time. The format is YYYY-MM-DD HH:mm:ss.</p>
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
         * <p>The data list.</p>
         */
        @NameInMap("List")
        public java.util.List<ListXTelephonesResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of entries that meet the query conditions.</p>
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
