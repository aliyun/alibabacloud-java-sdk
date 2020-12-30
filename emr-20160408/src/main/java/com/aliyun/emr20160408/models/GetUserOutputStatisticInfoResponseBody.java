// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserOutputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserOutputList")
    public GetUserOutputStatisticInfoResponseBodyUserOutputList userOutputList;

    public static GetUserOutputStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserOutputStatisticInfoResponseBody self = new GetUserOutputStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserOutputStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserOutputStatisticInfoResponseBody setUserOutputList(GetUserOutputStatisticInfoResponseBodyUserOutputList userOutputList) {
        this.userOutputList = userOutputList;
        return this;
    }
    public GetUserOutputStatisticInfoResponseBodyUserOutputList getUserOutputList() {
        return this.userOutputList;
    }

    public static class GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput extends TeaModel {
        @NameInMap("User")
        public String user;

        @NameInMap("BytesOutput")
        public Long bytesOutput;

        public static GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput build(java.util.Map<String, ?> map) throws Exception {
            GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput self = new GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput();
            return TeaModel.build(map, self);
        }

        public GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput setBytesOutput(Long bytesOutput) {
            this.bytesOutput = bytesOutput;
            return this;
        }
        public Long getBytesOutput() {
            return this.bytesOutput;
        }

    }

    public static class GetUserOutputStatisticInfoResponseBodyUserOutputList extends TeaModel {
        @NameInMap("ClusterStatUserOutput")
        public java.util.List<GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput> clusterStatUserOutput;

        public static GetUserOutputStatisticInfoResponseBodyUserOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetUserOutputStatisticInfoResponseBodyUserOutputList self = new GetUserOutputStatisticInfoResponseBodyUserOutputList();
            return TeaModel.build(map, self);
        }

        public GetUserOutputStatisticInfoResponseBodyUserOutputList setClusterStatUserOutput(java.util.List<GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput> clusterStatUserOutput) {
            this.clusterStatUserOutput = clusterStatUserOutput;
            return this;
        }
        public java.util.List<GetUserOutputStatisticInfoResponseBodyUserOutputListClusterStatUserOutput> getClusterStatUserOutput() {
            return this.clusterStatUserOutput;
        }

    }

}
