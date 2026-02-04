// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetAuthCodeResponseBody extends TeaModel {
    @NameInMap("AuthModel")
    public GetAuthCodeResponseBodyAuthModel authModel;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAuthCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeResponseBody self = new GetAuthCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeResponseBody setAuthModel(GetAuthCodeResponseBodyAuthModel authModel) {
        this.authModel = authModel;
        return this;
    }
    public GetAuthCodeResponseBodyAuthModel getAuthModel() {
        return this.authModel;
    }

    public GetAuthCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuthCodeResponseBodyAuthModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acv2ZEq2TNSqOlX+DvyetHGRT08iPhbWg/os1W4HojpBxkMQZkAnbKSfz/wNvS0E149IQZ5TogvBUE8ghCSVV+QBnv48Y+sn4z9fY5ywZA1peI5s4TplQI0TADBhPZXEIzMOdmbNsDGGlGcKOAq8ixd1Epzdu9XfvRzdLOO6o3zQwTZxXsjOgGBW8JTcgCP9W9iYiIjHIdZ2VCAnmMzuyVkyED8gymEevH10QoclyH/O3s8Yq6VF34gMXihDQeiI8PyiAZrW0JWXSWpdy3n4yGtAqMAgv46FzTA+XJ6C********</p>
         */
        @NameInMap("AuthCode")
        public String authCode;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        public static GetAuthCodeResponseBodyAuthModel build(java.util.Map<String, ?> map) throws Exception {
            GetAuthCodeResponseBodyAuthModel self = new GetAuthCodeResponseBodyAuthModel();
            return TeaModel.build(map, self);
        }

        public GetAuthCodeResponseBodyAuthModel setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

        public GetAuthCodeResponseBodyAuthModel setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public GetAuthCodeResponseBodyAuthModel setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

    }

}
