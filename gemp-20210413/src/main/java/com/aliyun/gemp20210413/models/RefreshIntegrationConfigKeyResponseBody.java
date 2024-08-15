// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RefreshIntegrationConfigKeyResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public RefreshIntegrationConfigKeyResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RefreshIntegrationConfigKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshIntegrationConfigKeyResponseBody self = new RefreshIntegrationConfigKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshIntegrationConfigKeyResponseBody setData(RefreshIntegrationConfigKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshIntegrationConfigKeyResponseBodyData getData() {
        return this.data;
    }

    public RefreshIntegrationConfigKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefreshIntegrationConfigKeyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>859FA6A2-AC5C-4B09-BE23-986F887H6A232</p>
         */
        @NameInMap("key")
        public String key;

        public static RefreshIntegrationConfigKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshIntegrationConfigKeyResponseBodyData self = new RefreshIntegrationConfigKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshIntegrationConfigKeyResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
