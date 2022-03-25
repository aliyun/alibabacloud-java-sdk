// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimStandardRenderResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimStandardRenderResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimStandardRenderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimStandardRenderResponseBody self = new GetBimStandardRenderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimStandardRenderResponseBody setDatas(GetBimStandardRenderResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimStandardRenderResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimStandardRenderResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimStandardRenderResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimStandardRenderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimStandardRenderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimStandardRenderResponseBodyDatas extends TeaModel {
        @NameInMap("Blocks")
        public java.util.Map<String, ?> blocks;

        @NameInMap("FontPrefix")
        public String fontPrefix;

        @NameInMap("GeometryPrefix")
        public String geometryPrefix;

        @NameInMap("Path")
        public String path;

        public static GetBimStandardRenderResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimStandardRenderResponseBodyDatas self = new GetBimStandardRenderResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimStandardRenderResponseBodyDatas setBlocks(java.util.Map<String, ?> blocks) {
            this.blocks = blocks;
            return this;
        }
        public java.util.Map<String, ?> getBlocks() {
            return this.blocks;
        }

        public GetBimStandardRenderResponseBodyDatas setFontPrefix(String fontPrefix) {
            this.fontPrefix = fontPrefix;
            return this;
        }
        public String getFontPrefix() {
            return this.fontPrefix;
        }

        public GetBimStandardRenderResponseBodyDatas setGeometryPrefix(String geometryPrefix) {
            this.geometryPrefix = geometryPrefix;
            return this;
        }
        public String getGeometryPrefix() {
            return this.geometryPrefix;
        }

        public GetBimStandardRenderResponseBodyDatas setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
