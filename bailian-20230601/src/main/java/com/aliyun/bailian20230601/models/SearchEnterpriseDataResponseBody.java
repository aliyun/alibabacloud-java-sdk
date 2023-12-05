// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class SearchEnterpriseDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<SearchEnterpriseDataResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchEnterpriseDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchEnterpriseDataResponseBody self = new SearchEnterpriseDataResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchEnterpriseDataResponseBody setData(java.util.List<SearchEnterpriseDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchEnterpriseDataResponseBodyData> getData() {
        return this.data;
    }

    public SearchEnterpriseDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchEnterpriseDataResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchEnterpriseDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchEnterpriseDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchEnterpriseDataResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DataName")
        public String dataName;

        @NameInMap("Score")
        public String score;

        @NameInMap("Source")
        public String source;

        @NameInMap("Text")
        public String text;

        @NameInMap("Title")
        public String title;

        @NameInMap("TitlePath")
        public String titlePath;

        public static SearchEnterpriseDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchEnterpriseDataResponseBodyData self = new SearchEnterpriseDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchEnterpriseDataResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public SearchEnterpriseDataResponseBodyData setDataName(String dataName) {
            this.dataName = dataName;
            return this;
        }
        public String getDataName() {
            return this.dataName;
        }

        public SearchEnterpriseDataResponseBodyData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public SearchEnterpriseDataResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchEnterpriseDataResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SearchEnterpriseDataResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchEnterpriseDataResponseBodyData setTitlePath(String titlePath) {
            this.titlePath = titlePath;
            return this;
        }
        public String getTitlePath() {
            return this.titlePath;
        }

    }

}
