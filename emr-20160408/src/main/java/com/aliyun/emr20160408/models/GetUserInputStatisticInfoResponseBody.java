// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserInputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserInputList")
    public GetUserInputStatisticInfoResponseBodyUserInputList userInputList;

    public static GetUserInputStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInputStatisticInfoResponseBody self = new GetUserInputStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInputStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInputStatisticInfoResponseBody setUserInputList(GetUserInputStatisticInfoResponseBodyUserInputList userInputList) {
        this.userInputList = userInputList;
        return this;
    }
    public GetUserInputStatisticInfoResponseBodyUserInputList getUserInputList() {
        return this.userInputList;
    }

    public static class GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput extends TeaModel {
        @NameInMap("BytesInput")
        public Long bytesInput;

        @NameInMap("User")
        public String user;

        public static GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput build(java.util.Map<String, ?> map) throws Exception {
            GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput self = new GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput();
            return TeaModel.build(map, self);
        }

        public GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput setBytesInput(Long bytesInput) {
            this.bytesInput = bytesInput;
            return this;
        }
        public Long getBytesInput() {
            return this.bytesInput;
        }

        public GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetUserInputStatisticInfoResponseBodyUserInputList extends TeaModel {
        @NameInMap("ClusterStatUserInput")
        public java.util.List<GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput> clusterStatUserInput;

        public static GetUserInputStatisticInfoResponseBodyUserInputList build(java.util.Map<String, ?> map) throws Exception {
            GetUserInputStatisticInfoResponseBodyUserInputList self = new GetUserInputStatisticInfoResponseBodyUserInputList();
            return TeaModel.build(map, self);
        }

        public GetUserInputStatisticInfoResponseBodyUserInputList setClusterStatUserInput(java.util.List<GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput> clusterStatUserInput) {
            this.clusterStatUserInput = clusterStatUserInput;
            return this;
        }
        public java.util.List<GetUserInputStatisticInfoResponseBodyUserInputListClusterStatUserInput> getClusterStatUserInput() {
            return this.clusterStatUserInput;
        }

    }

}
