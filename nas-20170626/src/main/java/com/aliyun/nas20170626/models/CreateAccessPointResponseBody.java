// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessPointResponseBody extends TeaModel {
    @NameInMap("AccessPoint")
    public CreateAccessPointResponseBodyAccessPoint accessPoint;

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
        @NameInMap("AccessPointDomain")
        public String accessPointDomain;

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
