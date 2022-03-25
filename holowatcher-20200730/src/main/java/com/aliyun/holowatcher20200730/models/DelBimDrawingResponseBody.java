// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DelBimDrawingResponseBody extends TeaModel {
    @NameInMap("Datas")
    public DelBimDrawingResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DelBimDrawingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelBimDrawingResponseBody self = new DelBimDrawingResponseBody();
        return TeaModel.build(map, self);
    }

    public DelBimDrawingResponseBody setDatas(DelBimDrawingResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public DelBimDrawingResponseBodyDatas getDatas() {
        return this.datas;
    }

    public DelBimDrawingResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public DelBimDrawingResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DelBimDrawingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelBimDrawingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DelBimDrawingResponseBodyDatas extends TeaModel {
        // 源图纸id
        @NameInMap("DrawingId")
        public Long drawingId;

        // 源图纸操作状态
        @NameInMap("DrawingMode")
        public String drawingMode;

        // 归类id
        @NameInMap("Id")
        public Long id;

        public static DelBimDrawingResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            DelBimDrawingResponseBodyDatas self = new DelBimDrawingResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public DelBimDrawingResponseBodyDatas setDrawingId(Long drawingId) {
            this.drawingId = drawingId;
            return this;
        }
        public Long getDrawingId() {
            return this.drawingId;
        }

        public DelBimDrawingResponseBodyDatas setDrawingMode(String drawingMode) {
            this.drawingMode = drawingMode;
            return this;
        }
        public String getDrawingMode() {
            return this.drawingMode;
        }

        public DelBimDrawingResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
