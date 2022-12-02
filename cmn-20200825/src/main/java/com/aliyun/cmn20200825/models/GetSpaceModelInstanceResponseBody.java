// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetSpaceModelInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpaceModel")
    public GetSpaceModelInstanceResponseBodySpaceModel spaceModel;

    public static GetSpaceModelInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceModelInstanceResponseBody self = new GetSpaceModelInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpaceModelInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpaceModelInstanceResponseBody setSpaceModel(GetSpaceModelInstanceResponseBodySpaceModel spaceModel) {
        this.spaceModel = spaceModel;
        return this;
    }
    public GetSpaceModelInstanceResponseBodySpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    public static class GetSpaceModelInstanceResponseBodySpaceModel extends TeaModel {
        @NameInMap("Instance")
        public String instance;

        public static GetSpaceModelInstanceResponseBodySpaceModel build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceModelInstanceResponseBodySpaceModel self = new GetSpaceModelInstanceResponseBodySpaceModel();
            return TeaModel.build(map, self);
        }

        public GetSpaceModelInstanceResponseBodySpaceModel setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

    }

}
