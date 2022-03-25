// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimDrawingRenderResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimDrawingRenderResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimDrawingRenderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimDrawingRenderResponseBody self = new GetBimDrawingRenderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimDrawingRenderResponseBody setDatas(GetBimDrawingRenderResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimDrawingRenderResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimDrawingRenderResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimDrawingRenderResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimDrawingRenderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimDrawingRenderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimDrawingRenderResponseBodyDatas extends TeaModel {
        @NameInMap("Blocks")
        public java.util.Map<String, ?> blocks;

        @NameInMap("FontPrefix")
        public String fontPrefix;

        @NameInMap("GeometryPrefix")
        public String geometryPrefix;

        @NameInMap("Path")
        public String path;

        public static GetBimDrawingRenderResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimDrawingRenderResponseBodyDatas self = new GetBimDrawingRenderResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimDrawingRenderResponseBodyDatas setBlocks(java.util.Map<String, ?> blocks) {
            this.blocks = blocks;
            return this;
        }
        public java.util.Map<String, ?> getBlocks() {
            return this.blocks;
        }

        public GetBimDrawingRenderResponseBodyDatas setFontPrefix(String fontPrefix) {
            this.fontPrefix = fontPrefix;
            return this;
        }
        public String getFontPrefix() {
            return this.fontPrefix;
        }

        public GetBimDrawingRenderResponseBodyDatas setGeometryPrefix(String geometryPrefix) {
            this.geometryPrefix = geometryPrefix;
            return this;
        }
        public String getGeometryPrefix() {
            return this.geometryPrefix;
        }

        public GetBimDrawingRenderResponseBodyDatas setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
