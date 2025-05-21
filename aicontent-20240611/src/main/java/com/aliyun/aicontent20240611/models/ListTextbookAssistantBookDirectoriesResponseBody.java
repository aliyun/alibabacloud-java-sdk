// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBookDirectoriesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListTextbookAssistantBookDirectoriesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>B_USER_NOT_FOUND_EXCEPTION</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0A5E9849-A2F0-551D-A7D8-1A8118557BAB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTextbookAssistantBookDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantBookDirectoriesResponseBody self = new ListTextbookAssistantBookDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantBookDirectoriesResponseBody setData(ListTextbookAssistantBookDirectoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTextbookAssistantBookDirectoriesResponseBodyData getData() {
        return this.data;
    }

    public ListTextbookAssistantBookDirectoriesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListTextbookAssistantBookDirectoriesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListTextbookAssistantBookDirectoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTextbookAssistantBookDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTextbookAssistantBookDirectoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1323</p>
         */
        @NameInMap("labelId")
        public String labelId;

        @NameInMap("labelName")
        public String labelName;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic self = new ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic extends TeaModel {
        @NameInMap("labelId")
        public String labelId;

        @NameInMap("labelName")
        public String labelName;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic self = new ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection extends TeaModel {
        @NameInMap("children")
        public Object children;

        @NameInMap("directoryId")
        public String directoryId;

        @NameInMap("directoryName")
        public String directoryName;

        @NameInMap("topic")
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic> topic;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection self = new ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection setChildren(Object children) {
            this.children = children;
            return this;
        }
        public Object getChildren() {
            return this.children;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection setTopic(java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSectionTopic> getTopic() {
            return this.topic;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic extends TeaModel {
        @NameInMap("labelId")
        public String labelId;

        @NameInMap("labelName")
        public String labelName;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic self = new ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic setLabelName(String labelName) {
            this.labelName = labelName;
            return this;
        }
        public String getLabelName() {
            return this.labelName;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit extends TeaModel {
        @NameInMap("directoryId")
        public String directoryId;

        @NameInMap("directoryName")
        public String directoryName;

        @NameInMap("section")
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection> section;

        @NameInMap("topic")
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic> topic;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit self = new ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit setSection(java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection> section) {
            this.section = section;
            return this;
        }
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitSection> getSection() {
            return this.section;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit setTopic(java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnitTopic> getTopic() {
            return this.topic;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>05758807ed8e11eebe6e0c42a106bb02</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <strong>example:</strong>
         * <p>2 Jobs</p>
         */
        @NameInMap("directoryName")
        public String directoryName;

        @NameInMap("topic")
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic> topic;

        @NameInMap("unit")
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit> unit;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree self = new ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree setTopic(java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic> topic) {
            this.topic = topic;
            return this;
        }
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeTopic> getTopic() {
            return this.topic;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree setUnit(java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit> unit) {
            this.unit = unit;
            return this;
        }
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTreeUnit> getUnit() {
            return this.unit;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>55857</p>
         */
        @NameInMap("bookId")
        public String bookId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("bookVolume")
        public String bookVolume;

        /**
         * <strong>example:</strong>
         * <p>2010-1(2)</p>
         */
        @NameInMap("edition")
        public String edition;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("grade")
        public String grade;

        /**
         * <strong>example:</strong>
         * <p>2019-1(10)</p>
         */
        @NameInMap("impression")
        public String impression;

        /**
         * <strong>example:</strong>
         * <p>9787544413695</p>
         */
        @NameInMap("isbn")
        public String isbn;

        @NameInMap("publisher")
        public String publisher;

        /**
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        @NameInMap("subject")
        public String subject;

        @NameInMap("version")
        public String version;

        public static ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo self = new ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setBookId(String bookId) {
            this.bookId = bookId;
            return this;
        }
        public String getBookId() {
            return this.bookId;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setBookVolume(String bookVolume) {
            this.bookVolume = bookVolume;
            return this;
        }
        public String getBookVolume() {
            return this.bookVolume;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setImpression(String impression) {
            this.impression = impression;
            return this;
        }
        public String getImpression() {
            return this.impression;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }
        public String getIsbn() {
            return this.isbn;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListTextbookAssistantBookDirectoriesResponseBodyData extends TeaModel {
        @NameInMap("directoryTree")
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree> directoryTree;

        @NameInMap("editionInfo")
        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo editionInfo;

        public static ListTextbookAssistantBookDirectoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBookDirectoriesResponseBodyData self = new ListTextbookAssistantBookDirectoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyData setDirectoryTree(java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree> directoryTree) {
            this.directoryTree = directoryTree;
            return this;
        }
        public java.util.List<ListTextbookAssistantBookDirectoriesResponseBodyDataDirectoryTree> getDirectoryTree() {
            return this.directoryTree;
        }

        public ListTextbookAssistantBookDirectoriesResponseBodyData setEditionInfo(ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo editionInfo) {
            this.editionInfo = editionInfo;
            return this;
        }
        public ListTextbookAssistantBookDirectoriesResponseBodyDataEditionInfo getEditionInfo() {
            return this.editionInfo;
        }

    }

}
