// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimFragmentResponseBody extends TeaModel {
    @NameInMap("Datas")
    public UpdateBimFragmentResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateBimFragmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimFragmentResponseBody self = new UpdateBimFragmentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBimFragmentResponseBody setDatas(UpdateBimFragmentResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public UpdateBimFragmentResponseBodyDatas getDatas() {
        return this.datas;
    }

    public UpdateBimFragmentResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public UpdateBimFragmentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateBimFragmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBimFragmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateBimFragmentResponseBodyDatas extends TeaModel {
        @NameInMap("DrawingId")
        public Long drawingId;

        @NameInMap("DrawingMode")
        public String drawingMode;

        @NameInMap("Id")
        public Long id;

        public static UpdateBimFragmentResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            UpdateBimFragmentResponseBodyDatas self = new UpdateBimFragmentResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public UpdateBimFragmentResponseBodyDatas setDrawingId(Long drawingId) {
            this.drawingId = drawingId;
            return this;
        }
        public Long getDrawingId() {
            return this.drawingId;
        }

        public UpdateBimFragmentResponseBodyDatas setDrawingMode(String drawingMode) {
            this.drawingMode = drawingMode;
            return this;
        }
        public String getDrawingMode() {
            return this.drawingMode;
        }

        public UpdateBimFragmentResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
