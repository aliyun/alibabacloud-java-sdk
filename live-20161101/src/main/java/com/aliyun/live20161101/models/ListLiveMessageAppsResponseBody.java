// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageAppsResponseBody extends TeaModel {
    /**
     * <p>The list of interactive messaging applications.</p>
     */
    @NameInMap("AppList")
    public java.util.List<ListLiveMessageAppsResponseBodyAppList> appList;

    /**
     * <p>Indicates whether there is a next page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The starting position of the next page. This parameter is returned only when HasMore is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B8EB4994-1368-1458-B9F3-5B88D76D734C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveMessageAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageAppsResponseBody self = new ListLiveMessageAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageAppsResponseBody setAppList(java.util.List<ListLiveMessageAppsResponseBodyAppList> appList) {
        this.appList = appList;
        return this;
    }
    public java.util.List<ListLiveMessageAppsResponseBodyAppList> getAppList() {
        return this.appList;
    }

    public ListLiveMessageAppsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListLiveMessageAppsResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLiveMessageAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveMessageAppsResponseBodyAppList extends TeaModel {
        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The AppKey of the interactive messaging application. This value is required for authentication of related operations on this application.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>testApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The signature of the interactive messaging application. This value is required by the interactive messaging SDK.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AppSign")
        public String appSign;

        /**
         * <p>The creation time, represented as a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698305471</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("DataCenter")
        public String dataCenter;

        /**
         * <p>Indicates whether the interactive messaging application is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disable")
        public String disable;

        /**
         * <p>The modification time, represented as a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698305471</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The storage duration tier for group messages within the application. Valid values:</p>
         * <ul>
         * <li>0: Default value. Messages are stored for 30 days.</li>
         * <li>1: Messages are stored for 90 days.</li>
         * <li>2: Messages are stored for 180 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MsgLifeCycle")
        public Integer msgLifeCycle;

        public static ListLiveMessageAppsResponseBodyAppList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveMessageAppsResponseBodyAppList self = new ListLiveMessageAppsResponseBodyAppList();
            return TeaModel.build(map, self);
        }

        public ListLiveMessageAppsResponseBodyAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListLiveMessageAppsResponseBodyAppList setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListLiveMessageAppsResponseBodyAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListLiveMessageAppsResponseBodyAppList setAppSign(String appSign) {
            this.appSign = appSign;
            return this;
        }
        public String getAppSign() {
            return this.appSign;
        }

        public ListLiveMessageAppsResponseBodyAppList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListLiveMessageAppsResponseBodyAppList setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public ListLiveMessageAppsResponseBodyAppList setDisable(String disable) {
            this.disable = disable;
            return this;
        }
        public String getDisable() {
            return this.disable;
        }

        public ListLiveMessageAppsResponseBodyAppList setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListLiveMessageAppsResponseBodyAppList setMsgLifeCycle(Integer msgLifeCycle) {
            this.msgLifeCycle = msgLifeCycle;
            return this;
        }
        public Integer getMsgLifeCycle() {
            return this.msgLifeCycle;
        }

    }

}
