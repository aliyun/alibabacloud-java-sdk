// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessPointResponseBody extends TeaModel {
    /**
     * <p>The access point.</p>
     */
    @NameInMap("AccessPoint")
    public CreateAccessPointResponseBodyAccessPoint accessPoint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPointResponseBody self = new CreateAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessPointResponseBody setAccessPoint(CreateAccessPointResponseBodyAccessPoint accessPoint) {
        this.accessPoint = accessPoint;
        return this;
    }
    public CreateAccessPointResponseBodyAccessPoint getAccessPoint() {
        return this.accessPoint;
    }

    public CreateAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAccessPointResponseBodyAccessPoint extends TeaModel {
        /**
         * <p>The domain name of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-ie15ydanoz.001014****-w****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("AccessPointDomain")
        public String accessPointDomain;

        /**
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-ie15yd****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        public static CreateAccessPointResponseBodyAccessPoint build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessPointResponseBodyAccessPoint self = new CreateAccessPointResponseBodyAccessPoint();
            return TeaModel.build(map, self);
        }

        public CreateAccessPointResponseBodyAccessPoint setAccessPointDomain(String accessPointDomain) {
            this.accessPointDomain = accessPointDomain;
            return this;
        }
        public String getAccessPointDomain() {
            return this.accessPointDomain;
        }

        public CreateAccessPointResponseBodyAccessPoint setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

    }

}
