// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistResponseBody extends TeaModel {
    /**
     * <p>The list of playlists.</p>
     */
    @NameInMap("ProgramList")
    public java.util.List<ListPlaylistResponseBodyProgramList> programList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of playlists.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistResponseBody self = new ListPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlaylistResponseBody setProgramList(java.util.List<ListPlaylistResponseBodyProgramList> programList) {
        this.programList = programList;
        return this;
    }
    public java.util.List<ListPlaylistResponseBodyProgramList> getProgramList() {
        return this.programList;
    }

    public ListPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPlaylistResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListPlaylistResponseBodyProgramList extends TeaModel {
        /**
         * <p>The ID of the production studio to which the playlist belongs. Use this ID as a request parameter to add, delete, modify, or query the layout of a virtual studio.</p>
         * 
         * <strong>example:</strong>
         * <p>casdfasdfasfdasdflkasjdflaj****</p>
         */
        @NameInMap("CasterId")
        public String casterId;

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ProgramId")
        public String programId;

        /**
         * <p>The name of the playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>playlist1</p>
         */
        @NameInMap("ProgramName")
        public String programName;

        /**
         * <p>The number of times the playlist repeats after the first playback. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong> (default): The playlist does not repeat.</p>
         * </li>
         * <li><p><strong>-1</strong>: The playlist plays in a loop.</p>
         * </li>
         * <li><p>Other positive integers: The number of times the playlist repeats.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RepeatNumber")
        public Integer repeatNumber;

        /**
         * <p>The status of the playlist. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: stopped.</p>
         * </li>
         * <li><p><strong>1</strong>: running.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ListPlaylistResponseBodyProgramList build(java.util.Map<String, ?> map) throws Exception {
            ListPlaylistResponseBodyProgramList self = new ListPlaylistResponseBodyProgramList();
            return TeaModel.build(map, self);
        }

        public ListPlaylistResponseBodyProgramList setCasterId(String casterId) {
            this.casterId = casterId;
            return this;
        }
        public String getCasterId() {
            return this.casterId;
        }

        public ListPlaylistResponseBodyProgramList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListPlaylistResponseBodyProgramList setProgramId(String programId) {
            this.programId = programId;
            return this;
        }
        public String getProgramId() {
            return this.programId;
        }

        public ListPlaylistResponseBodyProgramList setProgramName(String programName) {
            this.programName = programName;
            return this;
        }
        public String getProgramName() {
            return this.programName;
        }

        public ListPlaylistResponseBodyProgramList setRepeatNumber(Integer repeatNumber) {
            this.repeatNumber = repeatNumber;
            return this;
        }
        public Integer getRepeatNumber() {
            return this.repeatNumber;
        }

        public ListPlaylistResponseBodyProgramList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
